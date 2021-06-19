package com.javastudio.tutorial.job;

import com.javastudio.tutorial.metrics.Metrics;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeConsumingTask implements Job {
    private Logger logger = LoggerFactory.getLogger(TimeConsumingTask.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.error("Time consuming task started!");
        Metrics.JOB_COUNTER.inc();
    }
}
