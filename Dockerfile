FROM openjdk:8
ADD target/employee.jar employee.jar
EXPOSE 9092
ENTRYPOINT ["java", "-jar", "employee.jar"]