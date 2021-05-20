FROM openjdk:8
EXPOSE 8080
COPY target/junit-practice/target/junit-practice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/junit-practice-0.0.1-SNAPSHOT.jar"]