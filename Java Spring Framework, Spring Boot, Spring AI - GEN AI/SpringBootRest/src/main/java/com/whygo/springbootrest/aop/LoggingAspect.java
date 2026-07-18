package com.whygo.springbootrest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.whygo.springbootrest.service.JobService.getJobById(..)) || execution(* com.whygo.springbootrest.service.JobService.updateJob(..))")
    public void logMethodCall(JoinPoint jp) {
        logger.info("Method is being Called : {}", jp.getSignature().getName());

    }


    @After("execution(* com.whygo.springbootrest.service.JobService.getJobById(..)) || execution(* com.whygo.springbootrest.service.JobService.updateJob(..))")
    public void logMethodExecuted(JoinPoint jp) {
        logger.info("Method is being executed : {}", jp.getSignature().getName());

    }

    @AfterThrowing("execution(* com.whygo.springbootrest.service.JobService.getJobById(..)) || execution(* com.whygo.springbootrest.service.JobService.updateJob(..))")
    public void logMethodCrashed(JoinPoint jp) {
        logger.info("Method has Exception : {}", jp.getSignature().getName());

    }

    @AfterReturning("execution(* com.whygo.springbootrest.service.JobService.getJobById(..)) || execution(* com.whygo.springbootrest.service.JobService.updateJob(..))")
    public void logMethodSuccess(JoinPoint jp) {
        logger.info("Method Executed Successfully : {}", jp.getSignature().getName());

    }

}
