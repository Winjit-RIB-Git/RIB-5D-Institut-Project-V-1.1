package _5DInstitut.testContext;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paulhammant.ngwebdriver.NgWebDriver;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static NgWebDriver ngWebDriver;
	public static JavascriptExecutor jsDriver;
	public JavascriptExecutor executor;

	public static WebDriver BrowserFactory(String BrowserName) {

		if(BrowserName.equals("Chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito","--disable-notifications");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			jsDriver =(JavascriptExecutor)driver;
			ngWebDriver = new NgWebDriver(jsDriver);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
		}
		else if(BrowserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			jsDriver =(JavascriptExecutor)driver;
			ngWebDriver = new NgWebDriver(jsDriver);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

		}
		else {
			System.out.println("Driver Not Supported");
		}

		return driver;

	}
	
	public static  WebDriver tearDown(Scenario scenario) {

		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				scenario.log("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
				//scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png", screenshotName);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return driver;
	}

	/*public static File ScreenShot_1() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File trgtFile = new File(System.getProperty("user.dir") + "//screenshots/screenshot.png");
		trgtFile.getParentFile().mkdir();
		trgtFile.createNewFile();
		Files.copy(scrFile, trgtFile);
		return trgtFile;
	}
	
	public static ITestResult ScreenShot_2(ITestResult result) throws IOException {
		if (result.isSuccess()) {
			File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String failureImageFileName = result.getMethod().getMethodName()
					+ new SimpleDateFormat("MM-dd-yyyy_HH-ss").format(new GregorianCalendar().getTime()) + ".png";
			File failureImageFile = new File(System.getProperty("user.dir") + "//screenshots//" + failureImageFileName);
			failureImageFile.getParentFile().mkdir();
			failureImageFile.createNewFile();
			Files.copy(imageFile, failureImageFile);
		}
		return result;
		
	}*/

	public static WebDriver BrowserClose() {
		if (driver !=null) {
			driver.close();
		}
		return driver;
	}

	public static NgWebDriver WaitForSynchronized() {
		ngWebDriver.waitForAngularRequestsToFinish();
		return ngWebDriver;
	}

	public static String currentDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String cal1 = dateFormat.format(cal.getTime());
		return cal1;
	}
	


}
