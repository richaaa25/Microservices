FROM openjdk:8-jdk-alpine

ENV PORT=8081

VOLUME /tmp

EXPOSE $PORT

ARG JAR_FILE=target/orders-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} orders.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","orders.jar"]