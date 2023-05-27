FROM openjdk:20-jdk-oraclelinux7
COPY target/BpayAPI.jar .
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "BpayAPI.jar"]