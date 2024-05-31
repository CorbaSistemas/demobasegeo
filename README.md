# Projeto de Base Geográfica

Este projeto de Base Geográfica visa gerenciar os cadastros de Continente, País, Região e Estado. 
Foi desenvolvido utilizando tecnologias modernas e robustas, como Java 17, Docker-Compose, Spring Boot, Flyway, JUnit e 
PostgreSQL, seguindo a Arquitetura DDD (Domain-Driven Design). A documentação da API está disponível através do Swagger.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada para o desenvolvimento da aplicação.
- **Spring Boot**: Framework para criação de aplicações Java baseadas em Spring.
- **Docker-Compose**: Ferramenta para definir e executar multi-containers Docker.
- **Flyway**: Ferramenta de migração de banco de dados para controle de versões do esquema do banco.
- **JUnit**: Framework de testes para garantir a qualidade e funcionalidade do código.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional utilizado como base de dados.
- **REST**: Arquitetura utilizada para a criação de APIs.
- **Swagger**: Ferramenta para documentação e teste de APIs RESTful.
- **DDD (Domain-Driven Design)**: Abordagem de modelagem de software centrada no domínio do problema.

## Estrutura do Projeto

O projeto está estruturado de acordo com os princípios de DDD, da seguinte forma:

- `src/main/java`: Contém o código fonte da aplicação.
    - `com.example.demo`
        - `interfaces`: Contém os controladores REST e configurações específicas da aplicação.
        - `domain`: Contém as entidades, repositórios e serviços de domínio.
        - `infra`: Contém as implementações de repositórios e configurações de infraestrutura.
- `src/main/resources`: Contém os recursos da aplicação.
    - `application.properties`: Arquivo de configuração da aplicação.
    - `db/migration`: Contém os scripts de migração do Flyway.
- `src/test/java`: Contém os testes unitários da aplicação.

## Pré-requisitos

- Java 17
- Maven
- Docker e Docker-Compose

## Configuração do Banco de Dados

O projeto utiliza Docker-Compose para configurar e iniciar o banco de dados PostgreSQL.

