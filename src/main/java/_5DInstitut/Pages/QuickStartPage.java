package _5DInstitut.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import _5DInstitut.Utilities.Interact;

public class QuickStartPage extends Interact{
	
	public QuickStartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//button[contains(@title,'Quick Start')]") WebElement QuickStart;
	@FindBy (xpath = "//input[contains(@ng-model,'searchmodule')]") WebElement SearchBox;
	
	public void SearchModule(String modulename) throws Exception {
		clickOnElement(QuickStart);
		Thread.sleep(1000);
		clickOnElement(SearchBox);
		SearchBox.sendKeys(modulename);
		WebElement moduleClick = driver.findElement(By.xpath("//button[normalize-space()='"+modulename+"']"));
		Thread.sleep(1000);
		moduleClick.click();
		Thread.sleep(3000);
	}
	
}
