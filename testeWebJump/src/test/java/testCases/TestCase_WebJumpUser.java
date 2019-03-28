package testCases;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import pagesObjects.WebJumpUser;

public class TestCase_WebJumpUser {
	
	static WebDriver driver;
	static WebJumpUser user;
	String baseUrl = "https://webjump-user.github.io/testqa/";
	
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		
		user = new WebJumpUser(driver);
	}

	@After
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
	}
	
	@Test
	public void test01() {
		user.ClickButtons();
		user.VerifyButtonsHidden();
		
	}
	
	@Test
	public void test02() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)"); // rola a tela para baixo
		driver.switchTo().frame(0); // necessário para entrar no iframe presente na pagina.
		user.ClickButtons();
		user.VerifyButtonsHidden();
		driver.switchTo().defaultContent(); // sair do iframe.
	}
	
	@Test
	public void test03() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		user.FillFieldsInForm();
		user.ClickOnlyButtonOne();
		user.CheckOptionThree();
		user.Select_ExampleTwo();
		user.VerifyLogoSelenium();
	}

}
