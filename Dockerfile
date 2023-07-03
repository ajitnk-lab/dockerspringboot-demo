FROM adoptopenjdk/openjdk11
RUN apt update -y
RUN apt install maven -y
RUN mvn package
ADD target/demo-0.0.1-SNAPSHOT.jar .
CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
