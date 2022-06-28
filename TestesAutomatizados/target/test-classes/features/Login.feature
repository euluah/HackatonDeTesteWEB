#language: pt
#encoding: UTF-8

@Login
Funcionalidade: Login
	
	@LoginInvalido
	Cenario: usuario invalido
	Quando eu informar o usuario "invalido@admin.com"
	E informar a senha "asd"
	E clicar no botao login
	Entao o sistema exibe a mensagem de usuario invalido
	
	@LoginSucesso
	Cenario: realizar login
	Quando eu informar o usuario "admin@admin.com"
	E informar a senha "1234"
	E clicar no botao login
	Entao o sistema exibe o usuario logado
 
