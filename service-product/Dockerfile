FROM eclipse-temurin:26-jre-alpine
RUN apk add --no-cache curl
ARG JAR_FILE=target/service-product-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} service-product.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "service-product.jar"]