package _5DInstitut.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import _5DInstitut.Utilities.Interact;

public class LogoutPage extends Interact{
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//button[contains(@title,'Close Module')]") WebElement CloseProjectModule;

	public void CloseProjectModule() throws Exception {
		Thread.sleep(3000);
		clickOnElement(CloseProjectModule);
	}

	@FindBy (xpath ="//div[contains(@class,'menu main-color')]") WebElement LoginView;
	@FindBy (xpath = "//span[normalize-space()='Logout']") WebElement ClickLogout;

	public void LogoutApp() throws Exception {
		Thread.sleep(3000);
		clickOnElement(LoginView);
		clickOnElement(ClickLogout);
		Thread.sleep(3000);
	}
}
