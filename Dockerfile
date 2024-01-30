FROM openjdk:17-jdk-slim
LABEL authors="John"

WORKDIR /app

COPY target/demo3-*.jar /app/

CMD ["sh", "-c", "java -jar /app/demo3-*.jar"]