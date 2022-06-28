#language: pt
#encoding: UTF-8

@Transferencia
Funcionalidade: Transferencia
	
	@TransferenciaInvalida
	Cenario: Realizar transferencia invalida

	Quando eu clicar no botao transferencia
	E informar o numero da conta "1231"
	E informar o digito "1"
	E informar o valor da transferencia "50"
	E informar a descricao "toma aqui 50 reais"
	E clicar no botao de transferir agora
	E clicar no botao fechar
	E clicar no botao voltar
	Entao o saldo nao muda
	
	
