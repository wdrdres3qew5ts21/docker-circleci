FROM openjdk:alpine
WORKDIR /app
ADD /target/deploy-0.0.1-SNAPSHOT.jar /app
EXPOSE 1234:1234
CMD [ "java","-jar","/app/deploy-0.0.1-SNAPSHOT.jar" ]