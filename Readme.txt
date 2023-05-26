Build application jar file
--------------------------
	mvnw package

Create docker image and push to Docker Hub
------------------------------------------
docker login ajitnklab/DockerAjit@1234
docker build -t ajitnklab/dockerspringboot-demo:openjdk11 .
docker push ajitnklab/dockerspringboot-demo:openjdk11