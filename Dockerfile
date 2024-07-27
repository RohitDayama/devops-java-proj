from openjdk:17
ADD target/demo.devops.java-0.0.1-SNAPSHOT.jar demo.devops.java-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo.devops.java-0.0.1-SNAPSHOT.jar"]