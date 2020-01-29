# Requerimentos

- Instalar o Java
- Possuir uma IDE.

## Instalação

- Clonar o projeto do Git a patir do endereço https://github.com/marcelojunin/projeto-backend.git em alguma pasta.
- Importar o projeto maven pela IDE (Para o exemplo usarei o STS).
- Clicar com botão direito na classe principal -> Run as -> Spring Boot App.

## Informações

O projeto irá rodar por padrão na porta 8080.

## Endpoint

Para acessar o endpoint é necessário possuir API Client como por exemplo o Postman.
Instalado o Postman, basta abrir uma aba, selecionar o metodo POST, utilizar a url http://localhost:8080/projeto e no corpo da requisição, usar o JSON abaixo:

{
	"nombre": "Meu Nome",
	"email": "email@hotmail.com",
	"tipodoc": "cedula",
	"numdoc": "111"	
}

Após esses passos, clicar em send e aguardar a resposta.
