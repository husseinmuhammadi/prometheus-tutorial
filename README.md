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


## Grafana

By default, Grafana will be listening on http://localhost:3000. The default login is "admin" / "admin".

### Creating a Prometheus data source

To create a Prometheus data source in Grafana:

1. Click on the "cogwheel" in the sidebar to open the Configuration menu.
2. Click on "Data Sources".
3. Click on "Add data source".
4. Select "Prometheus" as the type.
5. Set the appropriate Prometheus server URL (for example, http://localhost:9090/)
6. Adjust other data source settings as desired (for example, choosing the right Access method).
7. Click "Save & Test" to save the new data source.
