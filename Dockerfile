FROM openjdk:8-jdk-alpine
COPY target/*.jar /tmp/services.jar
ENTRYPOINT ["java","-jar","/tmp/services.jar"]
EXPOSE 8096