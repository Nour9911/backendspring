FROM openjdk:8-jre-alpine
ADD target/shopback.jar shotback.jar
EXPOSE 8081
CMD ["java", "-jar", "/shopback.jar"]
