mvn clean install
sudo docker build --build-arg JAR_FILE=target/*.jar -t poc/kata .
sudo docker run -p 8080:8080 poc/kata
