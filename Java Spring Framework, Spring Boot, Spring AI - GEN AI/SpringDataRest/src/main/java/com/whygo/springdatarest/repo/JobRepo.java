package com.whygo.springdatarest.repo;

import com.whygo.springdatarest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepo extends JpaRepository<JobPost, Integer> {

  //  List<JobPost> findByPostProfileContainingOrPostDescContaining(String techStack);
}
