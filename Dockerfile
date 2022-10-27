FROM openjdk:8-jre-alpine
ADD target/shopback.jar shopback.jar
EXPOSE 8080
CMD ["java", "-jar", "/shopback.jar"]