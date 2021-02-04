This repo is a reproduction of https://github.com/spring-cloud/spring-cloud-config/issues/1795

# Steps to reproduce

1. Launch the configuration server with 
```
./gradlew config-server:bootrun
```

2. Use the following command to launch the Spring Boot 2.3 application (using the bootstrap)
```
./gradlew spring-boot-23:bootrun
```
You will see `Resolved value is 'From config server'` being printed.

3. Use the following command to launch the Spring Boot 2.4 application
```
./gradlew spring-boot-24:bootrun
```
You will see `Resolved value is 'From ./config/application.yml'` being printed.
