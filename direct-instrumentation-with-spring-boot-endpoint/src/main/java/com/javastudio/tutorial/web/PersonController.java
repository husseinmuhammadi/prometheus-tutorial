package com.javastudio.tutorial.web;

import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.logging.LoggingMeterRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    LoggingMeterRegistry registry;

    private static final List<String> people = new ArrayList<>(50);

    public PersonController() {
        people.add("Sandy");
        people.add("Sue");
        // registry.counter(people, "population");
    }

    @GetMapping("/api/people")
    public List<String> index() {
        return people;
    }
}
