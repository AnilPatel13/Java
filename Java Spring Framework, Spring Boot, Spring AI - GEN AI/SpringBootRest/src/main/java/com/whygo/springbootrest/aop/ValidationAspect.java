package com.whygo.springbootrest.aop;

import com.whygo.springbootrest.model.JobPost;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidationAspect {

    private static final Logger logger = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* com.whygo.springbootrest.service.JobService.getJobById(..)) && args(postId)")
    public Object validateJob(ProceedingJoinPoint jp, int postId) throws Throwable {
        logger.info("Validating Job Post: {}", postId);
        if(postId < 0){
            postId = -postId;
        }
        Object obj = jp.proceed(new Object[]{postId});
        return obj;
    }
}
