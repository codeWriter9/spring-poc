FROM adoptopenjdk/openjdk11:latest
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} swagger-rest-client-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/swagger-rest-client-0.0.1-SNAPSHOT.jar","-DUSERNAME=sanjay","-DPASSWORD=sanjay"]
