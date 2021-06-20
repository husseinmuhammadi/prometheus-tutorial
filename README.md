# Prometheus Tutorial
An overview on prometheus with java, jetty, dropwizard and so on ...

## Build Project
```
docker build --no-cache -f Dockerfile .
docker build --no-cache -t "demo-app" -f Dockerfile .
```

## Start Prometheus abd Grafana

## Java Console Application 

## Java Web Application - Jetty

## Spring Boot Application - Actuator 

## Drop Wizard Sample 

## JMX

## A brief overview on metrics in Java

Create a simple application with prometheus and grafana
Create a restful api service and
Create a job
We will try to measure the number of requests and the time needed for each process and show the proper view on grafana

### Export metrics in Java Console Application
In the modern development approach we split each functionality into a service which is responsible for a single task responsibility as much as possible by considering the granularity.
https://tcblog.protiviti.com/2019/09/04/moving-to-microservices-how-granular-should-my-services-be/
So the entire service will work if only all parts of the system could work properly as a single service, so it is very important to monitor the functionality of each service.

Expose metrics 
