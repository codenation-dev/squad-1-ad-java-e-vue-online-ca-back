# Central de Erros - Back-end (API)

> Desafio final da Aceleração Dev de Java da Codenation, com apoio da Conta Azul.

## Tecnologia

- Java 8
- Spring Boot
- Maven
- PostgreSQL
- Swagger
- jUnit
- Docker

## Instalação

### Clonagem do repositório:

```bash
$ git clone https://github.com/codenation-dev/squad-1-ad-java-e-vue-online-ca-back.git
```

### Compilação e empacotamento

Será necessário ter o Maven instalado. Instruções para instalação: [https://maven.apache.org/install.html](https://maven.apache.org/install.html).

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

Para testar a aplicação acesse ```http://localhost:8080/register``` pelo navegador web. Se a resposta for um JSON vazio a aplicação está funcionando corretamente.

### Executando via Docker

Acesse o diretório da aplicação e execute:
```bash
$ docker-compose up
```

## Documentação da API:

A documentação da API pode ser acessada em ```http://localhost:8080/swagger-ui.html```.

## Equipe

- [Aislan Nadrowski](https://github.com/ANadrowski) 
- [Adjamilton Junior](https://github.com/ajunior)

## Front-end

O [front-end](https://github.com/codenation-dev/squad-1-ad-java-e-vue-online-ca-front) para esta aplicação foi desenvolvido por [David Alves](https://github.com/davidalves1), participante da Aceleração Dev de Vue.js.