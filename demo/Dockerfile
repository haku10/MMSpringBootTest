FROM ubuntu:18.10
RUN apt-get update
RUN apt-get -y install openjdk-11-jdk
ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk-amd64
VOLUME /tmp
RUN mkdir /app
WORKDIR /app
ENV JAR_TARGET "demo-0.0.1-SNAPSHOT.jar"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar build/libs/demo-0.0.1-SNAPSHOT.jar" ]