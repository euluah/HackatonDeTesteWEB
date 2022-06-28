package pageObjects;

import static utils.Utils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class TransferenciaPage extends TelaInicialPage{
	
	//TelaInicial
	
	public void clicarBotaoTransferencia() {
		transferencia.click();
	}
	
	//Tela de Transferencia
	
	@FindBy(xpath = "//input[@placeholder='Informe o n�mero da conta']")
	private WebElement campoNumeroConta;
	
	@FindBy(xpath = "//input[@placeholder='Informe o d�gito da conta']")
	private WebElement campoDigitoConta;
	
	@FindBy(xpath = "//input[@placeholder='Informe o valor da transfer�ncia']")
	private WebElement campoValorTranferencia;
	
	@FindBy(xpath = "//input[@placeholder='Informe uma descri��o']")
	private WebElement CampoDescricao;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement botaoSubmit;
	
	@FindBy(linkText  = "Fechar")
	private WebElement botaoFechar;
	
	@FindBy(xpath = "//a[@id='btnBack']")
	private WebElement botaoVoltar;
	
	public void informarCampoConta(String conta) {
		campoNumeroConta.sendKeys(conta);
	}
	
	public void informarCampoDigitoConta(String digito) {
		campoDigitoConta.sendKeys(digito);
	}
	public void informarCampoTransferencia(String valor) {
		campoValorTranferencia.sendKeys(valor);
	}
	public void informarCampoDescricao(String descricao) {
		CampoDescricao.sendKeys(descricao);
	}
	public void clicarBotaoSubmit() {
		botaoSubmit.click();;
	}
	
	public void clicarFechar() {
		botaoFechar.click();;
	}
	
	public void clicarBotaoVoltar() {
		botaoVoltar.click();;
	}

}
