FROM java:8-jdk-alpine
COPY ./target/traveldb-core-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch traveldb-core-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","traveldb-core-0.0.1-SNAPSHOT.jar"]