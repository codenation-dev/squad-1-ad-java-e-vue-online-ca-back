# API (Central de erros)

API da Central de erros. 

##### Endpoints com implementações já iniciadas:
- /register
Após subir a aplicação pode-se enviar alguns comandos POST:

> *curl --request POST localhost:8080/register -d "userName="Usuario1"&password="123456"&email="usuario1@squad1.com.br""*

> *curl --request POST localhost:8080/register -d "userName="Usuario2"&password="101010"&email="usuario2@squad1.com.br""*

> *curl --request POST localhost:8080/register -d "userName="Usuario3"&password="202020"&email="usuario3@squad1.com.br""*

E para ver a lista de Usuarios cadastrados, basta enviar uma requisição GET para (retorno será um Json): 
> *curl localhost:8080/register*

## Endpoints que faltam ser implementados:

- /login
- /users/reset-password
- /users/update
- /errors
- /erros/:id
- /errors/register
- /errors/archive/:id
- /errors/delete/:id



