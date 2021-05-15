# Monitoring Using Spring Boot 2.0, Prometheus, and Grafana

As from Spring Boot 2.0, Micrometer is the default metrics export engine. Micrometer is an application metrics facade that supports numerous monitoring systems. Atlas, Datadog, Prometheus, etc. to name a few (as we will be using Prometheus in this tutorial, we will be focusing on Prometheus only).

```
http://localhost:9000/actuator
http://localhost:9000/actuator/prometheus
```


## prometheus configuration 
```
#Global configurations
global:
  scrape_interval:     5s # Set the scrape interval to every 5 seconds.
  evaluation_interval: 5s # Evaluate rules every 5 seconds.

scrape_configs:
  - job_name: 'population'
    metrics_path: '/actuator/prometheus'
    static_configs:
      - targets: ['localhost:8080']
```
