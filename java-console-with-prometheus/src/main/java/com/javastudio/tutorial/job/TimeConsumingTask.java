package com.javastudio.tutorial.job;

import com.javastudio.tutorial.metrics.Metrics;
import io.prometheus.client.Histogram;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class TimeConsumingTask implements Job {
    private Logger logger = LoggerFactory.getLogger(TimeConsumingTask.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("Time consuming task started!");
        Histogram.Timer timer = Metrics.JOB_PROCESS_DURATION.startTimer();

        Metrics.JOB_COUNTER.inc();

        int i = new Random().nextInt(1000) + 1;
        logger.info("timeout: {}", i);
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        timer.observeDuration();
    }
}
