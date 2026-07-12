package com.whygo.jobportalproject.service;

import com.whygo.jobportalproject.model.JobPost;
import com.whygo.jobportalproject.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
        System.out.println("Job Added Successfully");
        System.out.println(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}
