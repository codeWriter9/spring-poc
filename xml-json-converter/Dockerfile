FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} xml-json-converter-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/xml-json-converter-0.0.1-SNAPSHOT.jar"]
