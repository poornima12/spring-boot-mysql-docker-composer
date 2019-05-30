FROM java:8

WORKDIR /app

COPY . /app

EXPOSE 8080
LABEL maintainer=“poornima.aras@gmail.com”
ADD ./target/spring-boot-mysql-docker-compose.jar  spring-boot-mysql-docker-compose.jar
ENTRYPOINT ["java","-jar","spring-boot-mysql-docker-compose.jar"]