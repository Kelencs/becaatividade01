package com.atividade.uimaps;

import org.openqa.selenium.WebDriver;

import com.atividade.core.Element;
import com.selenium.enums.ByValue;

public class InicioMap {
	WebDriver driver;
	
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
		
	}

	public Element selecTipoFormulario = new Element(driver,ByValue.XPATH, "//div[@class='nav']/select");
	
	public Element btnViewDemo(String string) {
		return new Element(driver, ByValue.XPATH, "(//a[text()='"+string+"']//following::a[text()='View Demo'])[1]");
	}

}























