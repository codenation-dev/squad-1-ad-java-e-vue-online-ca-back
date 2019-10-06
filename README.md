> Desafio final da Aceleração Dev de Java da Codenation, com apoio da Conta Azul.

# Central de Erros - Back-end (API)

Desenvolvimento de uma aplicação restful para registro e acesso a logs de erros registrados por microserviços, para possibilitar o monitoramento e auxiliar na tomada de decisão.

*A aplicação foi desenvolvida em conformidade com as instruções para o projeto final.* 

## Tecnologia

- [Java](https://www.oracle.com/technetwork/java/javase/downloads/index.html) ```1.8```
- [Spring Boot](https://spring.io/projects/spring-boot) ```2.1.7.RELEASE```
- [Maven](https://maven.apache.org/) ```3.6.2```
- [PostgreSQL](https://www.postgresql.org/) ```10.9``` 
- [Swagger](https://swagger.io/) ```2.9.2```
- [Docker](https://www.docker.com/) ```19.03.2 CE```

## Instalação

A aplicação foi configurada pra ser executada com o Maven, portanto será necessário a instalação dessa ferramenta. 

> Instalando o Maven: [https://maven.apache.org/install.html](https://maven.apache.org/install.html).

### Clonando o repositório:

```bash
$ git clone https://github.com/codenation-dev/squad-1-ad-java-e-vue-online-ca-back.git
```

### Compilando e empacotando a aplicação

```bash
$ cd squad-1-ad-java-e-vue-online-ca-back
$ mvn compile
$ mvn package
```

### Executando a aplicação

```bash
$ cd squad-1-ad-java-e-vue-online-ca-back
$ mvn spring-boot:run
```

> Para testar se a aplicação está em execução, acesse o endereço ```http://localhost:8080/users```. A resposta deve ser um JSON vazio.

## Executando via Docker

A aplicação foi configurada para possibilitar sua execução via Docker.

```bash
$ cd squad-1-ad-java-e-vue-online-ca-back
$ docker-compose up
```

## Endpoints

Após executar a aplicação, você pode acessar a documentação da API, contendo os endpoints implementados, no endereço ```http://localhost:8080/swagger-ui.html```.

## Diagramas

Representação visual dos diagramas de classe e do banco de dados.

#### UML

<img src="https://github.com/codenation-dev/squad-1-ad-java-e-vue-online-ca-back/blob/master/assets/uml.png" alt="Imagem representando as classes da aplicação">

#### Banco de Dados

<img src="https://github.com/codenation-dev/squad-1-ad-java-e-vue-online-ca-back/blob/master/assets/db.png" alt="Imagem representando as tabelas do banco de dados">

## Equipe de desenvolvimento

- [Aislan Nadrowski](https://github.com/ANadrowski) 
- [Adjamilton Junior](https://github.com/ajunior)

## Front-end

O [front-end](https://github.com/codenation-dev/squad-1-ad-java-e-vue-online-ca-front) para esta aplicação foi desenvolvido por [David Alves](https://github.com/davidalves1), participante da Aceleração Dev de Vue.js.

## Deploy

Para fins de demonstração de funcionamento, foi feito o deploy da aplicação nas plataformas [Heroku](https://www.heroku.com/) (back-end) e [Netlify](https://www.netlify.com/) (front-end).

- **Instâncias:**
    - [Front-end](https://squad-1-front.netlify.com)
    - [Back-end](https://squad-1-back.herokuapp.com)

> *Uma terceira instância foi criada no Heroku para o banco de dados PostgreSQL.*