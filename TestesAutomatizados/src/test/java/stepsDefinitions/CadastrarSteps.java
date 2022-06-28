package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarPage;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;

public class CadastrarSteps {
	
	@Quando("eu clicar no botao registrar")
	public void euClicarNoBotaoRegistrar() {
		Na(CadastrarPage.class).acionarBotaoRegistrar();
	}

	@Quando("informar o email {string}")
	public void informarOEmail(String email) {
		Na(CadastrarPage.class).informarCampoEmail(email);
	}

	@Quando("informar o nome {string}")
	public void informarONome(String nome) {
		Na(CadastrarPage.class).informarCampoNome(nome);
	}
	
	@Quando("informar o password {string}")
	public void informarOPassword(String senha) {
		Na(CadastrarPage.class).informarCampoSenha(senha);
	}

	@Quando("confirmar a senha {string}")
	public void confirmarASenha(String senha) {
		Na(CadastrarPage.class).informarCampoConfirmarSenha(senha);
	}
	
	@Quando("habilita conta com saldo")
	public void habilitaContaComSaldo() {
		Na(CadastrarPage.class).acionarHabilitarSaldo();
	}

	@Quando("clicar no botao cadastrar")
	public void clicarNoBotaoCadastrar() {
		Na(CadastrarPage.class).acionarBotaoCadastrar();
	}
	
	@Quando("clicar no botao excluir")
	public void clicarNoBotaoExcluir() throws InterruptedException {
		Na(CadastrarPage.class).acionarBotaoFechar();
	}

	@Entao("o sistema cadastra o usuario")
	public void oSistemaCadastraOUsuario() throws InterruptedException {

		
	}




}
