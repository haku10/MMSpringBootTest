FROM openjdk:jdk-alpine
VOLUME /tmp
RUN mkdir /app
WORKDIR /app
ENV JAR_TARGET "demo-0.0.1-SNAPSHOT.jar"

ENTRYPOINT [ "sh","-c","java -jar -Dspring.profiles.active=docker-compose ./build/libs/${JAR_TARGET}" ]