FROM openjdk:8-jdk-alpine
COPY . /app
WORKDIR /app
RUN ./gradlew build --refresh-dependencies
ENTRYPOINT ["java", "-jar", "/app/build/libs/template-0.0.1-all.jar"]
