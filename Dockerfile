FROM openjdk:8
VOLUME /tmp
EXPOSE 9080
ADD target/debugTestApplication-0.0.1-SNAPSHOT.jar debugTestApplication-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","debugTestApplication-0.0.1-SNAPSHOT.jar"]