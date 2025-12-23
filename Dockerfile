# Use lightweight Java 17 runtime
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy jar
COPY target/skillcraft-website-*.jar app.jar

# Expose app port (change if needed)
EXPOSE 9090

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]
