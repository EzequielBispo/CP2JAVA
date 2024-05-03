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

1. GET /brinquedos: Retorna todos os brinquedos cadastrados no banco de dados.
2. POST /brinquedos: Adiciona um novo brinquedo ao banco de dados. Os dados devem ser enviados em formato JSON.
3. GET /brinquedos/{id}: Retorna um brinquedo específico com base no ID fornecido.
4. PUT /brinquedos/{id}: Atualiza as informações de um brinquedo existente com base no ID fornecido. Os novos dados devem ser enviados em formato JSON.
5. DELETE /brinquedos/{id}: Remove um brinquedo do banco de dados com base no ID fornecido.

## Testes Web com Postman

Foram realizados testes dos endpoints utilizando o software Postman. Abaixo estão os prints de tela dos testes realizados:

1. GET /brinquedos:

   ![GET /brinquedos](get_brinquedos.png)

2. **POST /brinquedos**:

   ![POST /brinquedos](post_brinquedos.png)

3. GET /brinquedos/{id}:

   ![GET /brinquedos/{id}](get_brinquedos_id.png)

4. PUT /brinquedos/{id}:

   ![PUT /brinquedos/{id}](put_brinquedos_id.png)

5. DELETE /brinquedos/{id}:

   ![DELETE /brinquedos/{id}](delete_brinquedos_id.png)

## Conclusão

O sistema de gerenciamento de brinquedos foi desenvolvido com sucesso, utilizando o framework Spring Boot e integrando-se com o banco de dados Oracle. Os testes realizados com o Postman demonstraram que os endpoints estão funcionando conforme o esperado. Este sistema oferece uma base sólida para futuras expansões e melhorias.

## Referências

- Documentação do Spring Boot:
- Documentação do Oracle SQL Developer:
- Documentação do Postman:
