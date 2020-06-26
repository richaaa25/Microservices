FROM openjdk:8-jdk-alpine

ENV PORT=8082

VOLUME /tmp

EXPOSE $PORT

ARG JAR_FILE=target/aggregator-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} aggregator.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","aggregator.jar"]