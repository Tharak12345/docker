FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD /target/department-service department-service
ENTRYPOINT ["java","-jar","/department-service"]