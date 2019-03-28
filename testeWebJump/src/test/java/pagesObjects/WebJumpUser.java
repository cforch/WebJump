package pagesObjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebJumpUser {
	
	static WebDriver driver;

	public WebJumpUser(WebDriver driver) {
		WebJumpUser.driver = driver;
	}
	

	public void ClickButtons() {
		// Este metodo clica nos botões ONE, TWO e FOUR.
		WebElement button_one = driver.findElement(By.id("btn_one"));
		button_one.click();
		
		WebElement button_two = driver.findElement(By.id("btn_two"));
		button_two.click();
		
		WebElement button_four = driver.findElement(By.id("btn_link"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button_four);
		button_four.click();
		
	}
	
	public void VerifyButtonsHidden() {
		 // valida se os elementos sumiram da tela
		
		WebElement button_one = driver.findElement(By.id("btn_one"));
		if (button_one.isDisplayed() == false) {
			System.out.println("Botão UM ausente");
		}
		
		WebElement button_two = driver.findElement(By.id("btn_one"));
		if (button_two.isDisplayed() == false) {
			System.out.println("Botão DOIS ausente");
		}
		
		WebElement button_four = driver.findElement(By.id("btn_one"));
		if (button_four.isDisplayed() == false) {
			System.out.println("Botão QUATRO ausente");
		}
		
	}
	
	public void FillFieldsInForm() {
		// Este metodo insere texto no campo first name.
		WebElement first_name = driver.findElement(By.id("first_name"));
		first_name.click();
		first_name.sendKeys("Caio");
	}
	
	public void ResetButtons() {
		// Este metodo reseta os botões clicados.
		WebElement reset_button = driver.findElement(By.id("reset_buttons"));
		reset_button.click();
	}
	
	public void ClickOnlyButtonOne() {
		// Esse método clica no botão one
		WebElement button_one = driver.findElement(By.id("btn_one"));
		button_one.click();	
	}
	
	public void CheckOptionThree() {
		// Esse método checa a opção tres.
		WebElement checkbox_three = driver.findElement(By.id("opt_three"));
		checkbox_three.click();
	}
	
	public void Select_ExampleTwo() {
		// Esse metodo seleciona o examplo dois
		Select example = new Select(driver.findElement(By.id("select_box")));
		example.selectByVisibleText("ExampleTwo");
		
	}
	
	public void VerifyLogoSelenium() {
		// verifica se o logo selenium webdriver está presente na tela.
		WebElement logoSelenium = driver.findElement(By.xpath("//img[4]"));
		if(logoSelenium.isDisplayed()) {
			System.out.println("Logo Selenium displayed");
		}
		else {
			System.out.println("Logo Selenium not displayed");
		}
		
		
	}
	
	
	
}
