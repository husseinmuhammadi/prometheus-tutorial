FROM maven:3.6.3-jdk-11 as build
RUN mkdir -p /root/.m2 \
    && mkdir /root/.m2/repository
COPY settings.xml /root/.m2
WORKDIR /workspace
COPY pom.xml pom.xml
COPY java-console-with-prometheus java-console-with-prometheus
RUN mvn package

FROM openjdk:11
WORKDIR /demo
COPY --from=build /workspace/java-console-with-prometheus/target/demo.jar demo.jar
COPY --from=build /workspace/java-console-with-prometheus/target/lib lib
ENTRYPOINT ["java", "-jar", "demo.jar"]
