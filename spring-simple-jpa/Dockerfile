FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} spring-simple-jpa-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/spring-simple-jpa-0.0.1-SNAPSHOT.jar"]
