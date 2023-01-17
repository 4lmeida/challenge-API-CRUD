<h1 align="center"> API CRUD </h1>
<p align="center">
  <img src="https://img.shields.io/static/v1?label=spring&message=framework&color=blue&style=for-the-badge&logo=SPRING"/>
  <img src="https://img.shields.io/static/v1?label=Postman&message=API management&color=blue&style=for-the-badge&logo=postman"/>
  <img src="https://img.shields.io/static/v1?label=Apache&message=Dependency manager&color=blue&style=for-the-badge&logo=apache"/>
  <img src="http://img.shields.io/static/v1?label=License&message=MIT&color=green&style=for-the-badge"/>
</p>  

### Tópicos 

:small_blue_diamond: [Sobre o projeto](#Sobre-o-projeto-open_file_folder)

:small_blue_diamond: [Funcionalidades](#Funcionalidades)

:small_blue_diamond: [Modelo Conceitual](#Modelo-conceitual-page_with_curl)

:small_blue_diamond: [Layout](#Layoutou-Deploy--da-Aplicação-mag_right)

:small_blue_diamond: [Como rodar a aplicação](#como-rodar-a-aplicação-arrow_forward)

# Sobre o projeto :open_file_folder:

O API CRUD é um projeto desenvolvido para avaliar algumas competências referente ao módulo de CRUD que a escola [DevSuperior](https://devsuperior.com.br/cursos) passa como desafio para avançar no curso.

<p>
Algumas delas são: organização do projeto em camadas, tratamento de exeções, seeding da base de dados e criação de web services REST para acessar um recurso de clientes contendo as cinco operações básicas que consiste em buscar recursos paginados e por id, inserção, atualização e exclusão de recursos.
</p>

## Funcionalidades

:heavy_check_mark: Busca paginada de recursos.

:heavy_check_mark: Busca de recurso por id.  

:heavy_check_mark: Inserir novo recurso

:heavy_check_mark: Atualizar recurso. 

:heavy_check_mark: Deletar recurso. 

# Layout ou Deploy da Aplicação :mag_right:

- Endpoints:

![](https://github.com/4lmeida/challenge-API-CRUD/blob/main/src/assets/api-crud.gif)

# Modelo conceitual :page_with_curl:
![Modelo Conceitual](https://github.com/4lmeida/challenge-API-CRUD/blob/main/src/assets/diagramaClient.png)

## Linguagens, dependencias e libs utilizadas :books:
- [JAVA](https://www.java.com/pt-BR/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [JPA](https://spring.io/projects/spring-data-jpa) / [Hibernate](https://hibernate.org/)
- [Maven](https://maven.apache.org/)
- [H2](https://www.h2database.com/html/main.html)
- [Postman](https://www.postman.com/)

# Como rodar a aplicação :arrow_forward:

Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/4lmeida/challenge-API-CRUD

# entrar na pasta do projeto challenge-API-CRUD
cd challenge-API-CRUD

# executar o projeto
./mvnw spring-boot:run
```
# Autor

| [<img src="https://avatars.githubusercontent.com/u/93017964?v=4" width=115><br><sub>Luís Almeida</sub>](https://github.com/4lmeida) |
| :---: |

## Licença 

The [MIT License](https://github.com/4lmeida/challenge-API-CRUD/blob/main/LICENSE)(MIT)

Copyright :copyright: 2023 - API CRUD
