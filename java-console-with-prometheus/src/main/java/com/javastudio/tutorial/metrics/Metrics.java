package com.javastudio.tutorial.metrics;

import io.prometheus.client.Counter;

public class Metrics {
    public static final Counter JOB_COUNTER = Counter.build()
            .name("job_execution_count")
            .help("Number of execution of job in the application")
            .register();
}
