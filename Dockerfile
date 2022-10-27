FROM liferay/jdk11
EXPOSE 8081
ADD build/libs/demo_gradle-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "/app.jar"]
