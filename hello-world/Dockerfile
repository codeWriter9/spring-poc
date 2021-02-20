FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} hello-world-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/hello-world-0.0.1-SNAPSHOT.jar"]
