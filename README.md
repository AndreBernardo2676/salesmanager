# 🛒 SalesManager

Sistema de gerenciamento de vendas desenvolvido com **Spring Boot**, aplicando boas práticas de arquitetura em camadas (Model, Repository, Service e Controller).

O projeto simula um ambiente real de controle de clientes e pedidos, com regras de negócio e relacionamento entre entidades usando JPA/Hibernate.

---

## 🚀 Tecnologias Utilizadas

- Java 25
- Spring Boot
- Spring Data JPA
- Hibernate
- Banco de Dados (H2 / MySQL)
- Maven

---

## 📚 Conceitos Aplicados

- Arquitetura em camadas
- Relacionamento 1:N (Cliente → Pedido)
- Injeção de Dependência
- Regras de negócio no Service
- Query derivada com Spring Data JPA
- Implementação correta de `equals()` e `hashCode()` em entidades JPA

---

## 🗂️ Estrutura do Projeto

com.andre.salesmanager
│
├── controller
├── service
├── repository
└── model

---

## 🧩 Modelo de Domínio

### Cliente
- id
- nome
- email (único)
- cpf (único)
- lista de pedidos

### Pedido
- id
- data
- cliente (ManyToOne)

Relacionamento:

Cliente 1 → N Pedidos

---

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
git clone https://github.com/SEU_USUARIO/salesmanager.git

2. Acesse a pasta do projeto:
cd salesmanager

4. Execute a aplicação:
./mvnw spring-boot:run
ou execute pela sua IDE.

4. A aplicação estará disponível em:

---

## 🔎 Funcionalidades Implementadas

- Cadastro de Cliente
- Criação de Pedido vinculado a Cliente
- Listagem de pedidos por cliente
- Validação de cliente inexistente ao criar pedido

---

## 🛠️ Melhorias Futuras

- Implementação de DTOs
- Tratamento global de exceções
- Paginação
- Testes unitários
- Autenticação com Spring Security

---

## 👨‍💻 Autor

Desenvolvido por Andre Bernardo  
Projeto criado para prática e consolidação de conhecimentos em Spring Boot e arquitetura backend.

