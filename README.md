## person-service

[![Build Status](https://github.com/shin-san/person-service/actions/workflows/build-push.yml/badge.svg)](https://github.com/shin-san/person-service/actions/workflows/build-push.yml)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) App for retrieving user details.

## Requirements

For building and running the application you need:

- [OpenJDK 11](https://openjdk.org/projects/jdk/11/)
- [Maven 3](https://maven.apache.org)
- [Docker](https://docs.docker.com/get-docker/) (Optional)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `au.com.jc.data.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Docker

### Containerise the service

The repo contains a simple Dockerfile that picks a compiled .jar and turns it into an contained image ready for use at any container orchestrator platform of your choice.

```shell
# create a .jar package first

# this maven goal should create a .jar file that is located in ./target directory
mvn clean package

# this should containerise the service into an immutable image
docker build -t shin-san/person-service:latest .
```

### Run the service

To run the service, you can either use Docker's UI (if available) and expose port of your choosing prior to running it.

Otherwise, you can use the following command to run it:
```shell
docker run -e POSTGRES_URL=localhost -e DB_USERNAME=test -e DB_PASSWORD=test -p 8080:8080 -d --name person-service shin-san/person-service
```

This will run the service in Docker with:
- an environment variable of `POSTGRES_URL` set to `locahost`
- an environment variable of `DB_USERNAME` set to `test`
- an environment variable of `DB_PASSWORD` set to `test`
- exposed container port of `8080` to local port `8080`
- detached running the container in background
- container is named as `person-service`  

## Copyright

Released under the Apache License 2.0. See the [LICENSE](https://github.com/shin-san/person-service/blob/master/LICENSE) file.
