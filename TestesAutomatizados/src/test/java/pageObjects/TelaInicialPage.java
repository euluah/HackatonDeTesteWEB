package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage {

	@FindBy(xpath = "//a[@id='btn-TRANSFERÊNCIA']")
	public WebElement transferencia;
	
	@FindBy(xpath = "//a[@id='btn-PAGAMENTOS']")
	public WebElement pagamentos;
	
	@FindBy(xpath = "//a[@id='btn-EXTRATO']")
	public WebElement extrato;
	
	@FindBy(xpath = "//a[@id='btn-SAQUE']")
	public WebElement saque;
	
	@FindBy(xpath = "//span[normalize-space()='R$ 1.000,00']")
	public WebElement saldo;
	
	public void clicarBotaoTransferencia() throws InterruptedException {
		Thread.sleep(8000);
		transferencia.click();
	}
	
	public void clicarBotaoPagamentos() {
		pagamentos.click();
	}
	
	public void clicarBotaoExtrato() throws InterruptedException {
		Thread.sleep(8000);
		extrato.click();
	}
	
	public void clicarBotaoSaque() {
		saque.click();
	}
	
	public String saldo() {
		return saldo.getText();
	}
}
