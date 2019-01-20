FROM openjdk:8-jre
MAINTAINER Lusifer <topsale@vip.qq.com>

ENV DOCKERIZE_VERSION v0.6.1
RUN wget http://192.168.75.128:81/upload/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz

RUN mkdir /app
COPY itoken-zipkin-1.0.0-SNAPSHOT.jar /app/app.jar

ENTRYPOINT ["dockerize", "-timeout", "5m", "-wait", "http://192.168.75.128:8888/itoken-zipkin/prod/master", "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar", "--spring.profiles.active=prod"]

EXPOSE 9411