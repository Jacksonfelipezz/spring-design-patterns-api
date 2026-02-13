# 🏛️ Spring Design Patterns & API Integration (DIO Bootcamp)

Este projeto foi desenvolvido como parte de um laboratório prático durante o **Bootcamp na DIO (Digital Innovation One)**. O objetivo principal foi aplicar os padrões de projeto mais utilizados pelo mercado em uma solução real com **Spring Boot** e **Java**.

## 🎯 Objetivo do Estudo
O foco não foi apenas criar um CRUD, mas sim construir uma arquitetura que respeite os princípios de **Clean Code** e **Single Responsibility**, demonstrando como o Spring Framework facilita a implementação de Design Patterns consagrados.

## 🧠 Conceitos e Padrões Implementados

### 1. Singleton & Injeção de Dependências
Explorei a fundo o gerenciamento de Beans do Spring, utilizando a injeção de dependências (`@Autowired`) para manter a aplicação desacoplada e garantir que instâncias de serviço sejam gerenciadas de forma eficiente pelo container.

### 2. Strategy Pattern
Implementei a interface `ClienteService` para permitir diferentes estratégias de negócio. Isso garante que o sistema possa evoluir ou mudar sua lógica de persistência sem afetar quem consome o serviço (Controllers).

### 3. Facade (Fachada)
Este é o ponto alto do projeto: criei uma **Facade** que abstrai a complexidade da integração externa. O usuário apenas fornece o CEP, e o sistema orquestra:
* A consulta ao banco de dados local.
* A chamada à API **ViaCEP** via **OpenFeign** (se necessário).
* A persistência automática dos dados de endereço.

### 4. Operações REST Completas (CRUD)
Dominei a semântica correta do protocolo HTTP, garantindo que cada operação siga as melhores práticas:
* `GET`: Recuperação eficiente de dados.
* `POST`: Criação com processamento de dados externos.
* `PUT`: Atualização de registros com garantia de integridade de ID.
* `DELETE`: Gerenciamento e expurgo de dados do banco.

## 🛠️ Stack Tecnológica
* **Java**: Linguagem base para o desenvolvimento da lógica de negócio.
* **Spring Boot**: Framework principal para acelerar a criação e gestão da aplicação.
* **Spring Data JPA**: Abstração para facilitar a persistência e comunicação com o banco de dados.
* **Spring Cloud OpenFeign**: Ferramenta para consumo de APIs externas de forma simples e organizada.
* **H2 Database**: Banco de dados em memória para agilidade no desenvolvimento e testes.
* **Swagger/OpenAPI**: Interface para documentação e testes dos endpoints da API.

---
"O desenvolvimento deste projeto no bootcamp da DIO me permitiu consolidar a visão de um desenvolvedor back-end que não apenas escreve código, mas projeta soluções escaláveis e organizadas."
