# Meu Portfólio Pessoal – Rodrigo Barbosa De Sousa

Este é meu site pessoal desenvolvido em **Java + Spring Boot + Thymeleaf**, com integração de formulário de contato via Gmail, layout responsivo com Bootstrap e suporte a Docker.

Estou compartilhando esse projeto como parte da minha transição de carreira. Após **9 anos estudando Java autodidata**, estou buscando minha primeira oportunidade como **Engenheiro Java Fullstack**.

---

## 🛠 Tecnologias Usadas

- Java 17+
- Spring Boot
- Thymeleaf (para renderização de HTML)
- Bootstrap 5 (para layout responsivo)
- Docker / Docker Compose
- Maven
- Git

---

## 🚀 Como Rodar Localmente

### Pré-requisitos
- Java 17+ instalado
- Maven instalado
- Git instalado

### Passos

1. Clone o repositório:
   ```
   bash
   
   git clone https://github.com/RodrigoLee56/site 

   ou 

   git clone git@github.com:RodrigoLee56/site.git
    ```
2. Navegue até o diretório do projeto:
   ```
   bash
   
   cd site
   ```  
3. Compile o projeto:
   ```
   bash
   
   mvn clean install
   ```
4. Execute o projeto:
   ```
   bash
   
   mvn spring-boot:run
   ```
5. Acesse o site no navegador:
   ```
   http://localhost:8080
   ```
### Executando com Docker
1. Certifique-se de ter o Docker e o Docker Compose instalados.
    ```
    bash
    
    docker --version
    docker-compose --version
    ```
2. Navegue até o diretório do projeto:
   ```
   bash
   
   cd site
   ```
3. Execute o comando para construir e iniciar os containers:
   ```
   bash
   
   docker-compose up --build
   ```
4. Acesse o site no navegador:
   ```
   http://localhost:8080
   ```
### 🔒 Configuração de E-mail (Gmail)

Se quiser usar o formulário de contato: 

1. Ative a verificação em duas etapas  no Google

2. Gere uma App Password  aqui: https://myaccount.google.com/apppasswords  

3. Atualize as variáveis de ambiente no docker-compose.yml

    ```
    yaml

    environment:
        SPRING_MAIL_USERNAME: seuemail@gmail.com
        SPRING_MAIL_PASSWORD: sua_app_password_aqui
    ```

### 📁 .gitignore Recomendado

Crie um arquivo .gitignore com:

```
bash
# Ignorar arquivos de compilação
# Maven
/target/
!.mvn
!.gitignore
!/Dockerfile
!/docker-compose.yml

# IDE
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

### 📄 Licença
```
text
MIT License

Copyright (c) 2025 Rodrigo Barbosa De Sousa

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---     
## 📫 Contato
- **LinkedIn**: [Rodrigo Barbosa De Sousa](https://www.linkedin.com/in/rodrigo-barbosa-de-sousa/)
- **GitHub**: [RodrigoLee56](https://github.com/RodrigoLee56/)
---
