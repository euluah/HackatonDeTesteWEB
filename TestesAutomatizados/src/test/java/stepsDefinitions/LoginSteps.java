package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	
	
	@Quando("eu informar o usuario {string}")
	public void InformarOUsuario(String email) {
		  Na(LoginPage.class).informarCampoEmail(email);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		  Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoAcessar() throws InterruptedException {
		  Thread.sleep(2000);
		  Na(LoginPage.class).acionarBotaoAcessar();
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() throws InterruptedException {
		Thread.sleep(4000);
		assertEquals("Olá admin,", driver.findElement(By.xpath("//p[@id='textName']")).getText());
	   
	}
	
	@Entao ("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() throws InterruptedException {
		Thread.sleep(2000);
		assertEquals("Fechar", driver.findElement(By.linkText("Fechar")).getText());
		driver.findElement(By.linkText("Fechar")).click();
		
	}
}
