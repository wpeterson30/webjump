package projeto.webjump.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {
	
	private WebDriver driver;
	
	@FindBy (id="btn_one")
    private WebElement botaoOne1; 
	
	@FindBy (id="btn_two")
    private WebElement botaoTwo; 
	
	@FindBy (id="btn_link")
    private WebElement botaoFour; 
	
	@FindBy (id="reset_buttons")
    private WebElement botaoReset; 
	
		
	@FindBy (id="first_name")
    private WebElement primeiroNome;
	
	@FindBy (id="mid_name")
    private WebElement nomeDoMeio;
		
	@FindBy (id="last_name")
    private WebElement ultimoNome;
	
	@FindBy (id="age")
    private WebElement suaIdade;
		
	@FindBy (id="email")
    private WebElement seuEmail;
	
	@FindBy (id="job")
    private WebElement seuEmprego;
	
	@FindBy (id="gender")
    private WebElement seuGenero;
	
	@FindBy (xpath="//input[@id='opt_three']")
    private WebElement botaoOptionThree;       // opção "OptionThre
	
	@FindBy (xpath="//option[@value='option_two']")
    private WebElement botaoSelectBoxTwo;       // selectbox opcao treen
	
	
	@FindBy (xpath="//img[@alt='selenium']")
    private WebElement logoSelenium;


	public HomeObjects(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getBotaoOne1() {
		return botaoOne1;
	}


	public void setBotaoOne1(WebElement botaoOne1) {
		this.botaoOne1 = botaoOne1;
	}


	public WebElement getBotaoTwo() {
		return botaoTwo;
	}


	public void setBotaoTwo(WebElement botaoTwo) {
		this.botaoTwo = botaoTwo;
	}


	public WebElement getBotaoFour() {
		return botaoFour;
	}


	public void setBotaoFour(WebElement botaoFour) {
		this.botaoFour = botaoFour;
	}


	public WebElement getBotaoReset() {
		return botaoReset;
	}


	public void setBotaoReset(WebElement botaoReset) {
		this.botaoReset = botaoReset;
	}


	public WebElement getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(WebElement primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public WebElement getNomeDoMeio() {
		return nomeDoMeio;
	}


	public void setNomeDoMeio(WebElement nomeDoMeio) {
		this.nomeDoMeio = nomeDoMeio;
	}


	public WebElement getUltimoNome() {
		return ultimoNome;
	}


	public void setUltimoNome(WebElement ultimoNome) {
		this.ultimoNome = ultimoNome;
	}


	public WebElement getSuaIdade() {
		return suaIdade;
	}


	public void setSuaIdade(WebElement suaIdade) {
		this.suaIdade = suaIdade;
	}


	public WebElement getSeuEmail() {
		return seuEmail;
	}


	public void setSeuEmail(WebElement seuEmail) {
		this.seuEmail = seuEmail;
	}


	public WebElement getSeuEmprego() {
		return seuEmprego;
	}


	public void setSeuEmprego(WebElement seuEmprego) {
		this.seuEmprego = seuEmprego;
	}


	public WebElement getSeuGenero() {
		return seuGenero;
	}


	public void setSeuGenero(WebElement seuGenero) {
		this.seuGenero = seuGenero;
	}


	public WebElement getBotaoOptionThree() {
		return botaoOptionThree;
	}


	public void setBotaoOptionThree(WebElement botaoOptionThree) {
		this.botaoOptionThree = botaoOptionThree;
	}


	public WebElement getBotaoSelectBoxTwo() {
		return botaoSelectBoxTwo;
	}


	public void setBotaoSelectBoxTwo(WebElement botaoSelectBoxTwo) {
		this.botaoSelectBoxTwo = botaoSelectBoxTwo;
	}


	public WebElement getLogoSelenium() {
		return logoSelenium;
	}


	public void setLogoSelenium(WebElement logoSelenium) {
		this.logoSelenium = logoSelenium;
	}
	
	
	
	
}
