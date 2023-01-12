FROM openjdk:17-jdk-slim-buster


ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 61613
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]




