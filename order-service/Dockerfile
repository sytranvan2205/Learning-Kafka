FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/order-service-1.0.0.jar order-service.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "order-service.jar"]