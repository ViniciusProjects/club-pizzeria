FROM openjdk:8
MAINTAINER Vinicius Santos
COPY . /var/www
WORKDIR /var/www
ENTRYPOINT Program.java


