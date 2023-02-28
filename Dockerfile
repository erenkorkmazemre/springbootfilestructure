FROM openjdk:17
ADD target/springbootfilestructure-0.0.1-SNAPSHOT.jar springbootfilestructure.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springbootfilestructure.jar"]