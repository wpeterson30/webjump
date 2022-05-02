package projeto.webjump.tests;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import projeto.webjump.actions.HomeActions;

class TesteWebJump {

	
	static WebDriver driver;
	static HomeActions actHome;
	
	@BeforeAll
	static void iniciarTestes() {
		System.out.println("Foram iniciados os testes com Before All");
	}
	
	@BeforeEach
	void abrirWebJump() {
	 
		System.setProperty("webdriver.chrome.driver","C:/webdrivers/chromedriver/101/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wj-qa-automation-test.github.io/qa-test/");
		driver.manage().window().maximize();
		actHome = new HomeActions(driver);
		
		
	}
	
	@Test
	void Test_1() throws Exception {
		
		actHome.primeiroCenarioTest();
		
		
	}
	
	
	@Test
	void Test_2() throws Exception {
		
		actHome.segunadoCenarioTest();
		
		
	}
	
	@Test
	void Test_3() throws Exception {
		
		
		actHome.TerceiroCenarioTest();
	    
		
		
	}
	
	@AfterEach
	void fecharJanela() {
		driver.close();
		
	}
	
	@AfterAll
	static void finalizarTestes() {
		
		System.out.println("Os teste foram finalizados com After All");
	}
	
}
