FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/notification-service-1.0.0.jar notification-service.jar

ENTRYPOINT ["java", "-jar", "notification-service.jar"]