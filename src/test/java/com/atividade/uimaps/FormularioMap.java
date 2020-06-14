package com.atividade.uimaps;

import org.openqa.selenium.WebDriver;

import com.atividade.core.Element;
import com.selenium.enums.ByValue;

public class FormularioMap {
WebDriver driver;
	
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
		
	}
	public Element inputRadio = new Element(driver,ByValue.ID,"wpforms-260271-field_1_1");
	public Element textAreaFirst = new Element(driver,ByValue.ID, "wpforms-260271-field_2");
	public Element textAreaTwo = new Element(driver,ByValue.ID, "wpforms-260271-field_3");
	public Element imputRadioTwo = new Element(driver,ByValue.ID, "wpforms-260271-field_1_5");
	public Element textAreeaTre = new Element(driver,ByValue.ID, "wpforms-260271-field_5");
	public Element textAreaFour = new Element(driver,ByValue.ID, "wpforms-260271-field_6");
	public Element btnSubmit = new Element(driver,ByValue.XPATH, "//button[text()='Submit']");
	
	public Element tituloMensagem = new Element(driver, ByValue.XPATH,"//h3[text()='Congrats, You Completed the First Step!']");
	public Element btnMensagem = new Element(driver, ByValue.XPATH,"//h3[text()='Get Started with WPForms Today']");

}
























