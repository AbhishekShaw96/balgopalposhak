# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file from the target directory to the container
COPY target/order-service-1.0.1.jar order-service.jar

# Expose the port your application runs on
EXPOSE 8002

# Run the application
ENTRYPOINT ["java", "-jar", "order-service.jar"]
