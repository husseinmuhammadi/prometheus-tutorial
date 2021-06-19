package com.javastudio.tutorial.job;


import com.javastudio.tutorial.Configuration;
import org.quartz.Job;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

public enum JobRunner {
    INSTANCE;

    private Logger logger = LoggerFactory.getLogger(JobRunner.class);

    private Properties properties = new Properties();

    public void start() {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            scheduler.scheduleJob(
                    newJob()
                            .withDescription("unknown transactions")
                            .ofType(TimeConsumingTask.class)
                            .build(),
                    newTrigger()
                            .withIdentity("time-consuming-task", "report-group")
                            .withSchedule(simpleSchedule()
                                    .withIntervalInSeconds(Integer.parseInt(Configuration.getProperty("job.execution.interval.in.second")))
                                    .repeatForever())
                            .build()
            );

            scheduler.start();
        } catch (SchedulerException e) {
            logger.error("Job could not be started!", e);
        }
    }
}

