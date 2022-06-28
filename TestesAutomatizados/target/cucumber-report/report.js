$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Cadastrar.feature");
formatter.feature({
  "name": "Cadastro de usuario",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Cadastro"
    }
  ]
});
formatter.scenario({
  "name": "cadastro de usuario",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Cadastro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no botao registrar",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastrarSteps.euClicarNoBotaoRegistrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o email \"admin@admin.com\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSteps.informarOEmail(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o nome \"admin\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSteps.informarONome(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o password \"1234\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSteps.informarOPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmar a senha \"1234\"",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSteps.confirmarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "habilita conta com saldo",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSteps.habilitaContaComSaldo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao cadastrar",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSteps.clicarNoBotaoCadastrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao excluir",
  "keyword": "E "
});
formatter.match({
  "location": "CadastrarSteps.clicarNoBotaoExcluir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema cadastra o usuario",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastrarSteps.oSistemaCadastraOUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Extrato.feature");
formatter.feature({
  "name": "Ver saldo",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "gerar extrato",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Extrato"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no botao extrato",
  "keyword": "Quando "
});
formatter.match({
  "location": "ExtratoSteps.euClicarNoBotaoExtrato()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe o saldo",
  "keyword": "Entao "
});
formatter.match({
  "location": "ExtratoSteps.oSistemaExibeOSaldo()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "usuario invalido",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LoginInvalido"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o usuario \"invalido@admin.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.InformarOUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"asd\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoAcessar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe a mensagem de usuario invalido",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeAMensagemDeUsuarioInvalido()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "realizar login",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@LoginSucesso"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu informar o usuario \"admin@admin.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "LoginSteps.InformarOUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a senha \"1234\"",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.informarASenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao login",
  "keyword": "E "
});
formatter.match({
  "location": "LoginSteps.clicarNoBotaoAcessar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o sistema exibe o usuario logado",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSteps.oSistemaExibeOUsuarioLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Transferencia.feature");
formatter.feature({
  "name": "Transferencia",
  "description": "",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Transferencia"
    }
  ]
});
formatter.scenario({
  "name": "Realizar transferencia invalida",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Transferencia"
    },
    {
      "name": "@TransferenciaInvalida"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "eu clicar no botao transferencia",
  "keyword": "Quando "
});
formatter.match({
  "location": "TransferenciaSteps.euClicarNoBotaoTransferencia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o numero da conta \"1231\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informarONumeroDaConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o digito \"1\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informarODigito(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar o valor da transferencia \"50\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informarOValorDaTransferencia(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informar a descricao \"toma aqui 50 reais\"",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.informarADescricao(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao de transferir agora",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.clicarNoBotaoDeTransferirAgora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao fechar",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.clicarNoBotaoFechar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao voltar",
  "keyword": "E "
});
formatter.match({
  "location": "TransferenciaSteps.clicarNoBotaoVoltar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "o saldo nao muda",
  "keyword": "Entao "
});
formatter.match({
  "location": "TransferenciaSteps.oSaldoNaoMuda()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
});