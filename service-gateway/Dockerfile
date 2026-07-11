FROM eclipse-temurin:26-jre-alpine
RUN apk add --no-cache curl
ARG JAR_FILE=target/service-gateway-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} service-gateway.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "service-gateway.jar"]