# 🧑‍💻 Meu Portfólio Pessoal – Rodrigo Barbosa De Sousa

[![Java](https://img.shields.io/badge/Java-17-blue?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.6-brightgreen?logo=springboot)](https://spring.io/projects/spring-boot)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-template-green?logo=thymeleaf)](https://www.thymeleaf.org/)
[![Docker](https://img.shields.io/badge/Docker-Suporte-blue?logo=docker)](https://www.docker.com/)
[![Render](https://img.shields.io/badge/Render-Deploy-lightgrey?logo=render)](https://render.com/)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](./LICENSE)

---

## 📌 Sobre o Projeto

Este é o meu site pessoal desenvolvido com **Java + Spring Boot + Thymeleaf**, com integração de formulário de contato via Gmail, layout responsivo utilizando o **Bulma CSS Framework** e suporte à execução via **Docker**.

Estou compartilhando este projeto como parte do meu desenvolvimento profissional e para compor meu portfólio. Após **7 anos estudando Java de forma autodidata**, por meio de plataformas como **DIO, DevMedia, YouTube, Udemy**, entre outras, estou em busca da minha primeira oportunidade como **Java Backend and Full Stack Developer**.

---

## 🌟 Funcionalidades

- ✅ Página inicial com apresentação profissional
- ✅ Formulário de contato funcional com envio via e-mail (JavaMail)
- ✅ Layout responsivo com Bulma CSS
- ✅ Integração com Gmail (App Password)
- ✅ Estrutura backend Spring Boot com templates Thymeleaf
- ✅ Suporte à execução via Docker e Docker Compose
- ✅ Deploy automático via Render

---

## 🔧 Tecnologias Utilizadas

### ☕ Backend
- **Java 17+** (OpenJDK)
- **Spring Boot 3.4.6**
- **JavaMail**

### 🌐 Frontend
- **Thymeleaf**
- **Bulma CSS**

### 🐳 Containerização
- **Docker**
- **Docker Compose**

### 📦 Build e Dependências
- **Maven**

### 📁 Controle de Versão
- **Git**
- **GitHub**

### 💻 IDEs e Ferramentas
- **Spring Tool Suite 4 (STS 4)**
- **Visual Studio Code (VSCode)**

### ☁️ Hospedagem
- **Render**

---

## 🚀 Como Rodar Localmente

### ✅ Pré-requisitos

- Java 17+ instalado  
- Maven instalado  
- Git instalado  

### 📌 Passos

1. Clone o repositório:
   ```bash
   git clone https://github.com/RodrigoLee56/MeuPortifolio.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd MeuPortifolio
   ```

3. Compile o projeto:
   ```bash
   mvn clean install
   ```

4. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```

5. Acesse no navegador:
   ```
   http://localhost:8080
   ```

---

## 🐳 Executando com Docker

1. Verifique se possui Docker e Docker Compose instalados:
   ```bash
   docker --version
   docker-compose --version
   ```

2. Navegue até o diretório:
   ```bash
   cd site
   ```

3. Execute:
   ```bash
   docker-compose up --build
   ```

4. Acesse no navegador:
   ```
   http://localhost:8080
   ```

---

## 🔒 Configuração de E-mail (Gmail)

Para que o formulário de contato envie e-mails corretamente:

1. Ative a verificação em duas etapas em sua conta Google  
2. Gere uma senha de aplicativo:  
   👉 [https://myaccount.google.com/apppasswords](https://myaccount.google.com/apppasswords)

3. Atualize as variáveis no `docker-compose.yml`:

   ```yaml
   environment:
     SPRING_MAIL_USERNAME: seuemail@gmail.com
     SPRING_MAIL_PASSWORD: sua_app_password_aqui
   ```

---

## 🗃 Arquivo `.gitignore` Recomendado

```gitignore
# Maven
/target/
!.mvn
!.gitignore
!/Dockerfile
!/docker-compose.yml

# IDEs
.idea/
*.iml
*.ipr
*.iws
*.swp
.DS_Store
__MACOSX/

# Logs
*.log
logs/

# Env
.env
application.properties
.env.local
.env.development
.env.test
```

---

## 🚧 Melhorias Futuras

- [ ] Adicionar modo escuro (dark mode)
- [ ] Criar painel administrativo para visualizar mensagens recebidas
- [ ] Publicar nova versão com integração de banco de dados PostgreSQL
- [ ] Implementar testes automatizados (JUnit, Mockito)
- [ ] Tradução multilíngue (i18n: português / inglês)

---

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [`LICENSE`](./LICENSE) para mais detalhes.

```text
MIT License

Copyright (c) 2025 Rodrigo Barbosa De Sousa

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction...
```

---

## 📫 Contato

- **LinkedIn**: [Rodrigo Barbosa De Sousa](https://www.linkedin.com/in/rodrigo-barbosa-de-sousa/)  
- **GitHub**: [RodrigoLee56](https://github.com/RodrigoLee56/)