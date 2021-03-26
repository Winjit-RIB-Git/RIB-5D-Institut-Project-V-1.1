package _5DInstitut.Utilities;


import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import _5DInstitut.testContext.BaseClass;
import io.cucumber.java.Scenario;

public class Interact extends BaseClass{
	Scenario s;
	private static JavascriptExecutor executor;
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver d) {
		this.driver=d;
	}
	public void clickOnElement(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		element.click();
	}

	public WebElement setElement(WebElement webElement, String text) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		element.sendKeys(text);
		return element;
	}

	public String getText(WebElement webElement) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(webElement));
		String value = element.getText();
		return value;
	}

	public static WebElement WaitForPageLoad(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		return element;
	}

	public static void JSElementClick(WebElement element) {
		executor = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 60);
		executor.executeScript("arguments[0].click();", element);
	}

	public static WebDriver SwitchToPopUp() throws Exception {
		ngWebDriver.waitForAngularRequestsToFinish();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String ModalWindow = iterator.next();
		driver.switchTo().window(ModalWindow);	
		return driver;
	}
}
