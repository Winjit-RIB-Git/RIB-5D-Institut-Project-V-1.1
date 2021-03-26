package _5DInstitut.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import _5DInstitut.Utilities.Interact;

public class HomePage extends Interact{
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Home page 
	@FindBy (xpath = "//h5[normalize-space()='Project']") WebElement clickProjectModule;
	
	public void OpenProjectModule() {
		clickOnElement(clickProjectModule);
	}

}
