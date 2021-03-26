package _5DInstitut.Hooks;

import org.openqa.selenium.WebDriver;

import _5DInstitut.ConfigReader.ConfigDataProvider;
import _5DInstitut.testContext.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook_BoQ_Line_Item {
	private WebDriver driver;
	public static Scenario scenario;
	public ConfigDataProvider config;

	@Before("@UAT")
	public void setDriver() {
		config = new ConfigDataProvider();
		BaseClass.BrowserFactory(config.getBrowser());
	}

	@After("@UAT")
	public void closeDriver(Scenario scenario) {
		BaseClass.tearDown(scenario);
		BaseClass.BrowserClose();
	}

}
