# Relatório: Desenvolvimento de um Sistema de Gerenciamento de Brinquedos

## Introdução

Este relatório descreve o desenvolvimento de um sistema para uma empresa de brinquedos destinados a crianças até 12 anos, utilizando o framework Spring Boot configurado com Maven e a linguagem Java. O sistema contempla operações básicas de CRUD (Create, Read, Update, Delete) e integração com um banco de dados Oracle.

## Tecnologias Utilizadas

- Spring Boot: Framework para desenvolvimento de aplicações Java.
- Maven: Gerenciador de dependências.
- Java: Linguagem de programação.
- Oracle SQL Developer: Ferramenta para gerenciamento de banco de dados Oracle.
- Postman: Software para testes de APIs.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `src/main/java`: Contém os arquivos Java do projeto.
- `src/main/resources`: Contém os recursos do projeto, como arquivos de configuração.
- `src/test`: Contém os arquivos de teste.
- `pom.xml`: Arquivo de configuração do Maven.

## Implementação

O sistema foi implementado seguindo os princípios do framework Spring Boot. Foram criados endpoints para realizar operações CRUD sobre os brinquedos. A integração com o banco de dados Oracle foi configurada utilizando o arquivo `persistence.xml` na pasta `META-INF`.

## Endpoints Disponíveis

1. POST /brinquedos: Adiciona um novo brinquedo ao banco de dados. Os dados devem ser enviados em formato JSON.
2. GET /brinquedos/{id}: Retorna um brinquedo específico com base no ID fornecido.
3. PUT /brinquedos/{id}: Atualiza as informações de um brinquedo existente com base no ID fornecido. Os novos dados devem ser enviados em formato JSON.
4. DELETE /brinquedos/{id}: Remove um brinquedo do banco de dados com base no ID fornecido.

## Testes Web com Postman

Foram realizados testes dos endpoints utilizando o software Postman. Abaixo estão os prints de tela dos testes realizados:


1. **POST /brinquedos**:

   ![image](https://github.com/EzequielBispo/CP2JAVA/assets/73908875/7014cac1-2ea7-45dd-8363-26bca0f0695d)



2. GET /brinquedos/{id}:

   ![image](https://github.com/EzequielBispo/CP2JAVA/assets/73908875/3d1dcf79-0104-4086-b0b8-7b242922d606)


3. PUT /brinquedos/{id}:

   ![image](https://github.com/EzequielBispo/CP2JAVA/assets/73908875/9c1eca66-d939-4ccb-ab85-ac91948dff0b)



4. DELETE /brinquedos/{id}:

   ![image](https://github.com/EzequielBispo/CP2JAVA/assets/73908875/d9c73e7a-be8d-4c80-8adb-7a7a8ea70221)

## Conclusão

O sistema de gerenciamento de brinquedos foi desenvolvido com sucesso, utilizando o framework Spring Boot e integrando-se com o banco de dados Oracle. Os testes realizados com o Postman demonstraram que os endpoints estão funcionando conforme o esperado. Este sistema oferece uma base sólida para futuras expansões e melhorias.

## Referências

- Documentação do Spring Boot:
- Documentação do Oracle SQL Developer:
- Documentação do Postman:
