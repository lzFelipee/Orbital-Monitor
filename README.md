# Orbital Monitor

## Sobre o Projeto

O Orbital Monitor é uma API REST desenvolvida em Java com Spring Boot para monitoramento de entidades espaciais, como satélites e sensores.

O sistema permite cadastrar, consultar, atualizar e remover informações de satélites e sensores, simulando um ambiente de monitoramento espacial através de Web Services.

Este projeto foi desenvolvido para a disciplina de Arquitetura Orientada a Serviços (SOA) e Web Services da FIAP.

---

# Objetivo

Desenvolver uma solução baseada em serviços para monitoramento de entidades espaciais, aplicando conceitos de:

* Arquitetura Orientada a Serviços (SOA)
* Programação Orientada a Objetos (POO)
* Herança
* Polimorfismo
* Interfaces
* Injeção de Dependência
* DTOs
* Tratamento de Exceções
* Banco de Dados
* Web Services

---

# Tecnologias Utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* Spring Web
* H2 Database
* Maven
* Swagger / OpenAPI
* GitHub

---

# Arquitetura do Projeto

```text
Swagger/OpenAPI
        ↓
Controllers
        ↓
Services
        ↓
Repositories
        ↓
Banco H2
```

---

# Estrutura do Projeto

```text
src/main/java/br/com/fiap/orbitalmonitor

├── controller
├── service
├── repository
├── model
├── dto
├── exception
├── config
```

---

# Modelagem de Domínio

## EntidadeEspacial (Classe Abstrata)

Atributos:

* id
* nome

### Satelite

Representa um satélite monitorado pelo sistema.

Atributos:

* tipoOrbita
* status

### Sensor

Representa um sensor responsável pela coleta de dados.

Atributos:

* tipo
* temperatura

---

# Herança e Polimorfismo

As classes:

* Satelite
* Sensor

herdam da classe abstrata:

```java
EntidadeEspacial
```

As entidades implementam a interface:

```java
MonitoramentoService
```

através do método:

```java
gerarAlerta()
```

demonstrando o uso de polimorfismo e abstração.

---

# Endpoints da API

## Satélites

| Método | Endpoint        |
| ------ | --------------- |
| GET    | /satelites      |
| GET    | /satelites/{id} |
| POST   | /satelites      |
| PUT    | /satelites/{id} |
| DELETE | /satelites/{id} |

## Sensores

| Método | Endpoint       |
| ------ | -------------- |
| GET    | /sensores      |
| GET    | /sensores/{id} |
| POST   | /sensores      |
| PUT    | /sensores/{id} |
| DELETE | /sensores/{id} |

---

# Banco de Dados

Banco utilizado:

* H2 Database

Tabelas criadas:

* SATELITE
* SENSOR

Acesso ao H2 Console:

```text
http://localhost:8080/h2-console
```

Configuração:

```text
JDBC URL: jdbc:h2:mem:orbitaldb
User: sa
Password:
```

---

# Swagger

A documentação da API está disponível em:

```text
http://localhost:8080/swagger-ui/index.html
```

---

# Tratamento de Exceções

O projeto utiliza exceções personalizadas para tratamento de recursos inexistentes.

Classe implementada:

```java
RecursoNaoEncontradoException
```

---

# DTO

DTO utilizado:

```java
SateliteDTO
```

Responsável pela transferência segura de dados entre as camadas da aplicação.

---

# Como Executar

### 1. Clonar o repositório

```bash
git clone https://github.com/lzFelipee/Orbital-Monitor.git
```

### 2. Entrar na pasta do projeto

```bash
cd orbitalmonitor
```

### 3. Executar a aplicação

```bash
mvn spring-boot:run
```

### 4. Acessar a aplicação

Swagger:

```text
http://localhost:8080/swagger-ui/index.html
```

Banco H2:

```text
http://localhost:8080/h2-console
```

---

# Integrantes

| Nome                              | RM        |
| --------------------------------- | --------- |
| Luiz Felipe Motta da Silva        | RM 559126 |
| Pedro Henrique Faim dos Santos    | RM 557440 |
| Nicolas Lorenzo Ferreira da Silva | RM 557962 |

---

Disciplina: Arquitetura Orientada a Serviços (SOA) e Web Services

Projeto: Orbital Monitor

FIAP - Global Solution 2026
