FROM openjdk:17
ADD target/springbootfilestructure-0.0.1-SNAPSHOT.jar springbootfilestructure.jar
ENTRYPOINT ["java","-jar","springbootfilestructure.jar"]