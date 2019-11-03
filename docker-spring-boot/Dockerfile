FROM openjdk:11
ADD var/lib/jenkins/workspace/build_spring/docker-spring-boot/target/docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-spring-boot.jar"]

