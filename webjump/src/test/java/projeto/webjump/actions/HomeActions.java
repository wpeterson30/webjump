package projeto.webjump.actions;

import org.openqa.selenium.WebDriver;

import projeto.webjump.pageobjects.HomeObjects;

public class HomeActions {
	
	static HomeObjects objHome;
	
	public HomeActions(WebDriver driver) {
		
		objHome = new HomeObjects(driver);
	}
    
	public static void primeiroCenarioTest() {
		
		objHome.getBotaoOne1().click();
		objHome.getBotaoTwo().click();
		objHome.getBotaoFour().click();
		objHome.getBotaoReset().click();
	}
	
    public static void segunadoCenarioTest() {
		
		objHome.getBotaoOne1().click();
		objHome.getBotaoTwo().click();
		objHome.getBotaoFour().click();
		
	}
	
    public static void TerceiroCenarioTest() {
	 
	   objHome.getPrimeiroNome().sendKeys("Willian");
	   objHome.getNomeDoMeio().sendKeys("Peterson");
	   objHome.getUltimoNome().sendKeys("Silva");
	   objHome.getSuaIdade().sendKeys("39 ");
	   objHome.getSeuEmail().sendKeys("wpeterson@hotmail.com");
	   objHome.getSeuEmprego().sendKeys("Analista QA/Test");
	   objHome.getSeuGenero().sendKeys("Masculino");
	   objHome.getBotaoOne1().click();
	   objHome.getBotaoOptionThree().click();
	   objHome.getBotaoSelectBoxTwo().click();
	   objHome.getLogoSelenium().click();
	   

    }
}
