package com.whygo.springbootrest.repo;

import com.whygo.springbootrest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postKeyword);


//    List<JobPost> jobList = new ArrayList<>(Arrays.asList(
//            new JobPost(1, "Java Developer", "Java Developer", 1, Arrays.asList("Java", "Spring", "Hibernate")),
//            new JobPost(2, "Python Developer", "Python Developer", 5, Arrays.asList("Python", "Django", "Flask")),
//            new JobPost(3, "Node.js Developer", "Node.js Developer", 2, Arrays.asList("Node.js", "Express.js", "React.js"))
//    ));
//
//    public List<JobPost> getAllJobs(){
//        return jobList;
//    }
//
//    public void addJob(JobPost jobPost){
//
//        jobList.add(jobPost);
//
//    }
//
//    public JobPost getJobById(int postId) {
//
//        for(JobPost job : jobList){
//            if(job.getPostId() == postId){
//                return job;
//            }
//        }
//
//       return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        for(JobPost jobpost1: jobList)
//        {
//            if(jobpost1.getPostId() == jobPost.getPostId()){
//                jobpost1.setPostProfile(jobPost.getPostProfile());
//                jobpost1.setPostDesc(jobPost.getPostDesc());
//                jobpost1.setReqExperience(jobPost.getReqExperience());
//                jobpost1.setPostTechStack(jobPost.getPostTechStack());
//            }
//        }
//    }
//
//    public void deleteJob(int postId) {
//        jobList.removeIf(job -> job.getPostId() == postId);
//    }
}
