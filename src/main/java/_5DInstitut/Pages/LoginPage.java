package _5DInstitut.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.gherkin.model.Scenario;
import _5DInstitut.Utilities.Interact;

public class LoginPage extends Interact{
	public Scenario scn;
	private WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Login page
	@FindBy (xpath=("//input[@id='username']")) WebElement enterusername;
	@FindBy (xpath=("//input[@id='password']"))	WebElement enterpassword;
	@FindBy (xpath=("//button[@id='loginbutton']"))	WebElement clickloginbutton;
	
	public void LoginToDesktop(String name,String pass ) throws Exception {
		Thread.sleep(3000);
		setElement(enterusername,name);
		setElement(enterpassword, pass);
	}
	public void ClickLogin() {
		clickOnElement(clickloginbutton);
	}
	
	//Company page
	@FindBy (xpath=("//i[@class='tree-branch-head']"))	WebElement companyDropDown;
	@FindBy (xpath = "//span[normalize-space()='901 iTWO Best Practice']") WebElement selectCompany;
	@FindBy (xpath = "//button[normalize-space()='Continue']") WebElement clickContinue;
	public void SelectCompany() {
		clickOnElement(companyDropDown);
		clickOnElement(selectCompany);
		clickOnElement(clickContinue);
	}
	
}
