FROM registry.access.redhat.com/ubi8/openjdk-11-runtime:1.13

WORKDIR /opt/app
COPY target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar", "-Djava.security.egd=file:/dev/./urandom", "/opt/app/app.jar"]

