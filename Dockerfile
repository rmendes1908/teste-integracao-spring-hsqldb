FROM openjdk:8u191-jdk-alpine3.8

ENV LANG C.UTF-8

RUN apk add --update bash

ADD target/*.jar /app/app.jar

CMD java -jar /app/app.jar