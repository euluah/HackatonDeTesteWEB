package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "email")
	private WebElement campoEmail;
	
	@FindBy(name = "password")
	private WebElement campoSenha;
	
	@FindBy(xpath = "//button[normalize-space()='Acessar']")
	private WebElement botaoAcessar;

	public void informarCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}
	
	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoAcessar() {
		botaoAcessar.click();
	}
	
	public void realizarLogin(String email, String senha) {
		informarCampoEmail(email);
		informarCampoSenha(senha);
		acionarBotaoAcessar(); 
	}
}
