# Use uma imagem oficial do OpenJDK com Java 17
FROM openjdk:17-jdk-slim

# Diretorio de trabalho dentro do container
WORKDIR /app

# Copia o JAR gerado pelo Maven
COPY target/MeuPortifolio-0.0.1-SNAPSHOT.jar app.jar

# Executa o projeto
ENTRYPOINT ["java", "-jar", "app.jar"]