package stepsDefinitions;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ExtratoPage;

public class ExtratoSteps {
	
	@Quando("eu clicar no botao extrato")
	public void euClicarNoBotaoExtrato() throws InterruptedException {
		Na(ExtratoPage.class).clicarBotaoExtrato();
	}

	@Entao("o sistema exibe o saldo")
	public void oSistemaExibeOSaldo() {
		assertEquals("Saldo disponível", driver.findElement(By.xpath("//p[@class='bank-statement__LabelText-sc-7n8vh8-10 UPwdn']")).getText());
	}

}
