package com.whygo.springsecurity.service;

import com.whygo.springsecurity.dao.UserRepo;
import com.whygo.springsecurity.model.User;
import com.whygo.springsecurity.model.UserPrincipal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {

    private static final Logger logger = LoggerFactory.getLogger(MyUserDetailService.class);

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        logger.info("Attempting to load user: {}", username);
        User user = userRepo.findByUsername(username);

        if (user == null){
            logger.warn("User not found : 404 - username: {}", username);
            throw new UsernameNotFoundException("User not found : 404");
        }

        logger.info("User found: {}", username);
        return new UserPrincipal(user);
    }
}
