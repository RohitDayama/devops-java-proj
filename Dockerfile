from openjdk:17
ADD target/demo.devops.java-0.0.-SNAPSHOT.jar devops.jar
ENTRYPOINT ["java","-jar","devops.jar"]