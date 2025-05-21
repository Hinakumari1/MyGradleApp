FROM openjdk:17-jdk-slim

WORKDIR /app

COPY app/build/libs/app-all.jar app.jar

CMD ["java", "-jar", "app.jar"]
