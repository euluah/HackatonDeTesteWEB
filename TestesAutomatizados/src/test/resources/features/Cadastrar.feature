#language: pt
#encoding: UTF-8

@Cadastro
Funcionalidade: Cadastro de usuario
	
	
	Cenario: cadastro de usuario

	Quando eu clicar no botao registrar
	E informar o email "admin@admin.com"
	E informar o nome "admin"
	E informar o password "1234"
	E confirmar a senha "1234"
	E habilita conta com saldo
	E clicar no botao cadastrar
	E clicar no botao excluir
	Entao o sistema cadastra o usuario
	
	
