FROM openjdk:8-jdk-alpine

LABEL authors="sytran"

WORKDIR /app

COPY target/inventory-service-1.0.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]