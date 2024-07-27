from openjdk:17
ADD target/demo.devops.java-0.0.1-SNAPSHOT.jar devops.jar
ENTRYPOINT ["java","-jar","devops.jar"]