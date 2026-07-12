package com.whygo.jobportalproject.repo;

import com.whygo.jobportalproject.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobList = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Java Developer", 1, Arrays.asList("Java", "Spring", "Hibernate")),
            new JobPost(2, "Python Developer", "Python Developer", 5, Arrays.asList("Python", "Django", "Flask")),
            new JobPost(3, "Node.js Developer", "Node.js Developer", 2, Arrays.asList("Node.js", "Express.js", "React.js"))
    ));

    public List<JobPost> getAllJobs(){
        return jobList;
    }

    public void addJob(JobPost jobPost){

        jobList.add(jobPost);

    }
}
