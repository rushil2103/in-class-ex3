#-----------------
# Build Stage
#-----------------
FROM gradle:8-jdk23 AS builder

# Copy the project files to the Gradle user home
COPY --chown=gradle:gradle . /home/gradle/src

# Set the working directory
WORKDIR /home/gradle/src

# Build the application, excluding tests
RUN gradle build -x test

#-----------------
# Package Stage
#-----------------
FROM openjdk:23-jdk
# Use a lighter image for runtime

# Create application directory
RUN mkdir /app

# Copy the jar file from the builder stage
COPY --from=builder /home/gradle/src/build/libs/*.jar /app/api-gateway.jar


# Set the working directory for the application WORKDIR /app

# Expose the application port
EXPOSE 9000

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/api-gateway.jar"]
