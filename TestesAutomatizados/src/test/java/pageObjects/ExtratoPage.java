package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExtratoPage extends TelaInicialPage{
	
	public void clicarBotaoExtrato() throws InterruptedException {
		Thread.sleep(4000);
		extrato.click();
	}

}
