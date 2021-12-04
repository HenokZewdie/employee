FROM openjdk:8-jre-alpine3.9
ADD target/employee.jar employee.jar
EXPOSE 9092
ENTRYPOINT ["java", "-jar", "employee.jar"]