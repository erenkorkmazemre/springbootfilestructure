FROM maven:3.8.6 AS build
RUN mvn clean install

FROM openjdk:17
ADD target/springbootfilestructure-0.0.1-SNAPSHOT.jar springbootfilestructure.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springbootfilestructure.jar"]