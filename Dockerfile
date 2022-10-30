FROM openjdk:8-jre-alpine
ADD target/shopback.jar shotback.jar
EXPOSE 8089
CMD ["java", "-jar", "/shopback.jar"]
