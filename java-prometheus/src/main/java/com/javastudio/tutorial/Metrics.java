package com.javastudio.tutorial;

import io.prometheus.client.Counter;

public class Metrics {
    public static final Counter EXCEPTION_COUNTER = Counter.build()
            .name("exception_count")
            .help("Number of exception in application")
            .register();
}
