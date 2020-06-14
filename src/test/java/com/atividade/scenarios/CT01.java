package com.atividade.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.atividade.core.Driver;
import com.atividade.pages.FormularioPage;
import com.atividade.pages.InicioPage;

public class CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;
	
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://wpforms.com/demo/");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);
	}
	@Test
	public void test() {
		inicioPage.selecionarTipoFormulario();
		formularioPage.preencherFormulario();
		formularioPage.validarMensagemSucesso();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@After
	public void after() {
		Driver.quit(driver);
	}

}





























