package com.whygo.springbootrest.service;

import com.whygo.springbootrest.model.JobPost;
import com.whygo.springbootrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.save(jobPost);
//        repo.addJob(jobPost);
        System.out.println("Job Added Successfully");
        System.out.println(jobPost);
    }

    public List<JobPost> getAllJobs(){
//        return repo.getAllJobs();
        return repo.findAll();
    }

    public JobPost getJobById(int postId) {
//        return repo.getJobById(postId);
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
//        repo.updateJob(jobPost);
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
//        repo.deleteJob(postId);
        repo.deleteById(postId);
    }

    public void loadData() {
        List<JobPost> jobList = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Java Developer", 1, Arrays.asList("Java", "Spring", "Hibernate")),
            new JobPost(2, "Python Developer", "Python Developer", 5, Arrays.asList("Python", "Django", "Flask")),
            new JobPost(3, "Node.js Developer", "Node.js Developer", 2, Arrays.asList("Node.js", "Express.js", "React.js"))
        ));

        repo.saveAll(jobList);
    }

    public List<JobPost> searchByKeyword(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}
