package com.selenium;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Script {public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","driver"+File.separator+"chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://wpforms.com/demo/online-proposal-form-demo/");
	
	driver.findElement(By.id("wpforms-264742-field_1")).sendKeys("kelen");
	driver.findElement(By.id("wpforms-264742-field_1-last")).sendKeys("cristina");
	driver.findElement(By.id("wpforms-264742-field_2")).sendKeys("kelen@gmail.com");
	driver.findElement(By.id("wpforms-264742-field_3")).sendKeys("034999999999");
	driver.findElement(By.id("wpforms-264742-field_4")).sendKeys("teste");
	driver.findElement(By.id("//input[@value='Yes']")).click();
	driver.findElement(By.id("//button[text()='Sumit]")).click();
	
	WebDriverWait wait = new WebDriverWait(driver,10);
	try {
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h3[text()='Congrats, You Completed the First Step!']")));
	System.out.println("Sucesso");
	}catch (Exception e) {
		System.out.println("Falha");
	}
	driver.close();
	
		
	
}

}






























