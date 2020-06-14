package com.atividade.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atividade.uimaps.FormularioMap;
import com.atividade.uimaps.InicioMap;

public class FormularioPage {
WebDriver driver;
	
	
	public FormularioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	FormularioMap formularioMap = new FormularioMap(driver);
	
	public void preencherFormulario() {
		formularioMap.inputRadio.click(driver);
		formularioMap.textAreaFirst.sendkeys(driver, "Eu participo sim");
		formularioMap.textAreaTwo.sendkeys(driver, "Eventos relacionados a cerveja");
		formularioMap.imputRadioTwo.click(driver);
		formularioMap.textAreeaTre.sendkeys(driver, "Porque eu não quero");
		formularioMap.textAreaFour.sendkeys(driver, "Ja disse");
		formularioMap.btnSubmit.click(driver);
	
		
	}
	
	public void  validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		try {
			
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(formularioMap.tituloMensagem.getValue())));
			String resultado = driver.findElement(By.xpath(formularioMap.btnMensagem.getValue())).getText();
			System.out.println(resultado);
			resultado = resultado;
			Assert.assertEquals( "Get Started with WPForms Today", resultado);
			System.out.println("Sucesso");
		}catch (Exception e) {
			System.out.println("Falha!");
		}
	}
}
	
	
	
	






















	
	
	
	
	
	
	
	
	
	
	
