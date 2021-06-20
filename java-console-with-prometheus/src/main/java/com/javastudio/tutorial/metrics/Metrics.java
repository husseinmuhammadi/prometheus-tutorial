package com.javastudio.tutorial.metrics;

import io.prometheus.client.Counter;
import io.prometheus.client.Histogram;

public class Metrics {
    public static final Counter JOB_COUNTER = Counter.build()
            .name("job_execution_count")
            .help("Number of execution of job in the application")
            .register();
    public static final Histogram JOB_PROCESS_DURATION = Histogram.build()
            // .buckets(0.75, 0.5, 0.25, 0.1)
            .name("job_process_duration")
            .help("Duration of execution of job in the application")
            .register();
}
