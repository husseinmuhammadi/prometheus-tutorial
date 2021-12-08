package com.javastudio.tutorial;

public class RateControl extends Thread {

    private Rate rate;

    public RateControl(Rate rate) {
        this.rate = rate;
    }

    @Override
    public void run() {
        double a = Math.PI*1.5;
        try {
            while (true) {
                rate.setValue(Math.sin(a) + 1);
                a += 0.01;
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
