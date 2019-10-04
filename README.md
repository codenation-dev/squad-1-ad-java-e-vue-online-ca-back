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



## Tabela de endpoints

```markdown
| Endpoint                   | Verbo | Função                                 | Retorno / Observações                                                                                                                                                                                                                                                                                                   |
|----------------------------|-------|----------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| localhost:8080/register    | GET   | Retorna lista de usuários cadastrados. | 200 OK                                                                                                                                                                                                                                                                                                                  |
| localhost:8080/register    | POST  | Cadastra um usuário no sistema.        | 201 CREATED se o usuário  foi cadastrado com sucesso.  409 CONFLICT se o usuário já está cadastrado.  Adicionar um header   “Content-Type” com  valor “application/json”.    Adicionar no body,   em modo raw, a seguinte   informação:    {  "name":  "Pedro",  "email":  "pedro@pedro.com",  "password":  "123456"  } |
| localhost:8080/oauth/token | POST  | Autenticar/Solicitar o token.          | O retorno será 200 OK se a autenticação ocorrer corretamente. O taken será retornado da seguinte forma:  {      "access_token": "f4f1b7ad-713a-473a-9273-9fdb5ce9abfc",     "token_type": "bearer",     "refresh_token": "ada96ee4-410b-4f13-9984-4b76b0303502",     "expires_in": 43199,     "scope": "password" }     |
| localhost:8080/logs        | GET   | Listar os logs cadastrados.            | 200 OK                                                                                                                                                                                                                                                                                                                  |
| localhost:8080/logs        | POST  | Cadastrar um log no sistema.           | 201 CREATED se o log foi cadastrado com sucesso. Em Authorization, usar Bearer Token e informar o token fornecido pelo sistema.                                                                                                                                                                                         |
| localhost:8080/logs/{id}   | GET   | Retorna um log especifico.             | 200 OK. Exemplo:  acessando localhost:8080/logs/5 se o log está cadastrado, teremos como resposta:  {     "id": 5,     "description": "desc3",     "origin": "20.20.20.22",     "details": "detail2",     "level": "ERROR",     "createdAt": "2019-10-04 13:41"  }                                                      |
|                            |       |                                        | 
```


## Front-end

O [front-end](https://github.com/codenation-dev/squad-1-ad-java-e-vue-online-ca-front) para esta aplicação foi desenvolvido por [David Alves](https://github.com/davidalves1), participante da Aceleração Dev de Vue.js.
