FROM openjdk:11
ADD /var/lib/jenkins/.m2/repository/com/deepali/docker/docker-spring-boot/0.0.1-SNAPSHOT/docker-spring-boot-0.0.1-SNAPSHOT.jar docker-spring-boot-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-spring-boot-0.0.1-SNAPSHOT.jar"]

