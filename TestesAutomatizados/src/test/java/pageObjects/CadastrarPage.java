package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarPage {
	
	@FindBy(xpath =  "//button[normalize-space()='Registrar']")
	private WebElement botaoRegistrar;
	
	@FindBy(xpath =  "//form[@class='styles__ContainerFormRegister-sc-7fhc7g-0 keVbpY']//input[@placeholder='Informe seu e-mail']")
	private WebElement campoEmail;
	
	@FindBy(xpath =  "//input[@placeholder='Informe seu Nome']")
	private WebElement campoNome;
	
	@FindBy(xpath =  "//form[@class='styles__ContainerFormRegister-sc-7fhc7g-0 keVbpY']//input[@placeholder='Informe sua senha']")
	private WebElement campoSenha;
	
	@FindBy(xpath =  "//input[@placeholder='Informe a confirmação da senha']")
	private WebElement campoConfirmar;
	
	@FindBy(xpath =  "//label[@id='toggleAddBalance']")
	private WebElement campoHabSaldo;
	
	@FindBy(xpath =  "//button[normalize-space()='Cadastrar']")
	private WebElement botaoCadastrar;
	
	@FindBy(linkText = "Fechar")
	private WebElement botaoFechar;
	
	
	public void acionarBotaoRegistrar() {
		botaoRegistrar.click();
	}
	
	public void informarCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}
	
	public void informarCampoNome(String nome) {
		campoNome.sendKeys(nome);
	}
	
	public void informarCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void informarCampoConfirmarSenha(String senha) {
		campoConfirmar.sendKeys(senha);
	}
	
	public void acionarBotaoCadastrar() {
		botaoCadastrar.click();
	}
	
	public void acionarHabilitarSaldo() {
		campoHabSaldo.click();
	}
	
	public void acionarBotaoFechar() throws InterruptedException {
		
		Thread.sleep(3000);
		botaoFechar.click();
		Thread.sleep(3000);
	
	}
	
	public void realizaCadastro(String email, String nome, String senha, String confirmaSenha) throws InterruptedException {
		acionarBotaoRegistrar();
		informarCampoEmail(email);
		informarCampoNome(nome);
		informarCampoSenha(senha);
		informarCampoConfirmarSenha(confirmaSenha);
		acionarHabilitarSaldo();
		acionarBotaoCadastrar();
		acionarBotaoFechar();
	}
	
	
	
	
	
	

}
