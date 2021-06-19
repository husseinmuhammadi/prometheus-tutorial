package com.javastudio.tutorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigurationTest {
    @Test
    void whenGetJobExecutionIntervalInSecondProperty_thenItShouldBeAPositiveNumber() {
        System.out.println(Configuration.getProperty("job.execution.interval.in.second"));
    }
}