FROM adoptopenjdk/openjdk11
WORKDIR /app
RUN apt-get install apache-maven
RUN mvn package
ADD target/demo-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","/app/demo-0.0.1-SNAPSHOT.jar"]