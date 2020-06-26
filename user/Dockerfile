FROM openjdk:8-jdk-alpine

ENV PORT=8080

VOLUME /tmp

EXPOSE $PORT

ARG JAR_FILE=target/user-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} user.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","user.jar"]