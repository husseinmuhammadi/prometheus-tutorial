package com.javastudio.tutorial.metrics;

import io.prometheus.client.Counter;

public class ApplicationMetrics {
    public static final Counter REQUEST_COUNTER = Counter.build()
            .name("request_count_3")
            .help("Number of the request invoke in the application")
            .register();
}
