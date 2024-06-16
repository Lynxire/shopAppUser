FROM maven:3.9.7-eclipse-temurin-22 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src/
RUN mvn clean package -DskipTests

FROM openjdk:22-jdk
WORKDIR /app
COPY --from=build /app/target/shop-app-user-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]