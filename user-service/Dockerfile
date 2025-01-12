# Use an official OpenJDK runtime as the base image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file from the target folder into the container
COPY target/user-service-1.0.1-SNAPSHOT.jar app.jar

# Expose port 8001 to allow external access
EXPOSE 8001

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]
