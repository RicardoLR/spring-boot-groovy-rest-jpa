FROM fabric8/java-jboss-openjdk8-jdk:1.3.1
LABEL maintainer="ricardolopez.computing@gmail.com"
LABEL module="multimodule-register"
ENV JAVA_APP_JAR demo-groovy-api-rest-0.0.1-SNAPSHOT.jar
ADD build/libs/demo-groovy-api-rest-0.0.1-SNAPSHOT.jar /deployments/
EXPOSE 8877


