FROM openjdk:8
EXPOSE 8080
ADD target/employee-details.jar employee-details.jar 
ENTRYPOINT ["java","-jar","/employee-details.jar"]