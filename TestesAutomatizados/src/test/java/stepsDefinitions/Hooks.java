package stepsDefinitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.CadastrarPage;
import pageObjects.LoginPage;

import static utils.Utils.*;

import javax.print.attribute.standard.MediaSize.NA;

import org.openqa.selenium.support.ui.Sleeper;

public class Hooks {
	
	@Before(value = "not @Cadastro and not @TransferenciaInvalida")
	public void setUp() throws InterruptedException {
		acessarSistema();
		Na(CadastrarPage.class).realizaCadastro("admin@admin.com", "admin", "1234", "1234");
	}
	
	
	@Before(value = "@Extrato")
	public void verExtrato() throws InterruptedException {
		acessarSistema();
		Na(CadastrarPage.class).realizaCadastro("admin@admin.com", "admin", "1234", "1234");
		Na(LoginPage.class).realizarLogin("admin@admin.com","1234");
	}
	
	@Before(value = "@TransferenciaInvalida")
	public void transferenciaInvalida() throws InterruptedException {
		acessarSistema();
		Na(CadastrarPage.class).realizaCadastro("admin@admin.com", "admin", "1234", "1234");
		Na(LoginPage.class).realizarLogin("admin@admin.com","1234");
	}
	
	@Before(value = "@Cadastro")
	public void realizarCadastro() {
		acessarSistema();
	}
	
	@After
	public void tearDown(Scenario scenario)  {
		capturarTela(scenario);
		driver.quit();
	}

}
