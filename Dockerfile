FROM openjdk:8-jre-alpine
ADD target/piCTA22.jar piCTA22.jar
EXPOSE 8080
CMD ["java", "-jar", "/piCTA22.jar"]
