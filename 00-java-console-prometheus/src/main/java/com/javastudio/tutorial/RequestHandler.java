package com.javastudio.tutorial;

import com.javastudio.tutorial.metrics.ApplicationMetrics;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestHandler extends Thread {
    private Logger logger = LoggerFactory.getLogger(RequestHandler.class);
    private final Rate rate;

    public RequestHandler(Rate rate) {
        this.rate = rate;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(String.format("%6.6f", rate.getValue()*1000));
                ApplicationMetrics.REQUEST_COUNTER.inc(rate.getValue()*1000);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
