package com.whygo.springbootrest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMonitorAspect {

    private static final Logger logger = LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution(* com.whygo.springbootrest.service.JobService.getJobById(..)) || execution(* com.whygo.springbootrest.service.JobService.updateJob(..))")
    public Object logExecutionTime(ProceedingJoinPoint jp) throws Throwable {

        long startTime = System.currentTimeMillis();

        Object obj = jp.proceed();

        long endTime = System.currentTimeMillis();

        logger.info("Execution Time: " +jp.getSignature().getName() + " " + (endTime - startTime) + " MS");

        return obj;
    }
}
