package com.whygo.springbootrest;

import com.whygo.springbootrest.model.JobPost;
import com.whygo.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){

        return service.getAllJobs();

    }

    @GetMapping("jobPost/{postId}")
    public JobPost addJob(@PathVariable("postId") int postId){
        return service.getJobById(postId);
    }

    @PostMapping("jobPost")
    @ResponseBody
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJobById(jobPost.getPostId());
//        return jobPost;
    }


    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJobById(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "Deleted Successfully";
    }

}
