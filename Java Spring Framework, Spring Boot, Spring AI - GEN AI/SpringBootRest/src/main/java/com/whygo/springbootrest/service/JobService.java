package com.whygo.springbootrest.service;

import com.whygo.springbootrest.model.JobPost;
import com.whygo.springbootrest.repo.JobRepo;
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

    public JobPost getJobById(int postId) {
        return repo.getJobById(postId);
    }

    public void updateJob(JobPost jobPost) {
        repo.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteJob(postId);
    }
}
