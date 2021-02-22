FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} swagger-spring-batch-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/swagger-spring-batch-0.0.1-SNAPSHOT.jar"]
