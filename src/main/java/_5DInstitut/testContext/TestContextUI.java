package _5DInstitut.testContext;

import org.openqa.selenium.WebDriver;

import _5DInstitut.Pages.BoQPage;
import _5DInstitut.Pages.HomePage;
import _5DInstitut.Pages.LoginPage;
import _5DInstitut.Pages.LogoutPage;
import _5DInstitut.Pages.QuickStartPage;

public class TestContextUI extends BaseClass {
	//private WebDriver driver;
	private LoginPage loginPage;
	private HomePage homePage;
	private BoQPage boqPage;
	private QuickStartPage quickStartPage;
	private LogoutPage logoutPage;
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}	

	public LoginPage getLoginPage() {
		return loginPage;
	}
	public HomePage getHomePage() {
		return homePage;
	}
	public BoQPage getBoQPage() {
		return boqPage;
	}

	public QuickStartPage getQuickStartPage() {
		return quickStartPage;
	}
	public LogoutPage getLogoutPage() {
		return logoutPage;
	}

	public void initializePageObjectClasses(WebDriver driver) {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		boqPage = new BoQPage(driver);
		quickStartPage = new QuickStartPage(driver);
		logoutPage = new LogoutPage(driver);
	}

}
