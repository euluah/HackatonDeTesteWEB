package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarPage;
import pageObjects.TransferenciaPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class TransferenciaSteps {
	
	@Quando("eu clicar no botao transferencia")
	public void euClicarNoBotaoTransferencia() {
		Na(TransferenciaPage.class).clicarBotaoTransferencia();
	}

	@Quando("informar o numero da conta {string}")
	public void informarONumeroDaConta(String conta) {
		Na(TransferenciaPage.class).informarCampoConta(conta);
	}

	@Quando("informar o digito {string}")
	public void informarODigito(String digito) {
		Na(TransferenciaPage.class).informarCampoDigitoConta(digito);
	}

	@Quando("informar o valor da transferencia {string}")
	public void informarOValorDaTransferencia(String valor) {
		Na(TransferenciaPage.class).informarCampoTransferencia(valor);
	}

	@Quando("informar a descricao {string}")
	public void informarADescricao(String descricao) {
		Na(TransferenciaPage.class).informarCampoDescricao(descricao);
	}

	@Quando("clicar no botao de transferir agora")
	public void clicarNoBotaoDeTransferirAgora() {
		Na(TransferenciaPage.class).clicarBotaoSubmit();
	}
	
	@Quando("clicar no botao fechar")
	public void clicarNoBotaoFechar() {
		Na(TransferenciaPage.class).clicarFechar();
	}

	@Quando("clicar no botao voltar")
	public void clicarNoBotaoVoltar() {
		Na(TransferenciaPage.class).clicarBotaoVoltar();
	}

	@Entao("o saldo nao muda")
	public void oSaldoNaoMuda() {
		String saldoAnterior = Na(TransferenciaPage.class).saldo();
		assertEquals(saldoAnterior, driver.findElement(By.xpath("//span[normalize-space()='R$ 1.000,00']")).getText());
	}


}
