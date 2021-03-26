package _5DInstitut.Pages;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import _5DInstitut.ConfigReader.ConfigDataProvider;
import _5DInstitut.Utilities.Interact;

public class BoQPage extends Interact {
	public static ConfigDataProvider config;

	public BoQPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Home page 
	@FindBy (xpath = "//span[normalize-space()='BoQ']") WebElement clickOnBoQ;
	@FindBy (xpath = "//button[@class='navbar-btn btn-main e2e-navbar-btn-refresh']") WebElement clickOnRefresh;
	@FindBy (xpath = "//button[@title='Wizard']") WebElement clicOnWizard;
	@FindBy (xpath = "//li[contains(text(),'Create and import multiple BoQs')]") WebElement clickOnCreateImportBoQ;

	public void SelectBoQ() {
		clickOnElement(clickOnBoQ);
	}
	public void RefreshProject() {
		clickOnElement(clickOnRefresh);
	}
	public void OpenWizard() {
		clickOnElement(clicOnWizard);
	}
	
//	public void CreateImportBoQs() throws Exception {
//		config = new ConfigDataProvider();
//		clickOnElement(clickOnCreateImportBoQ);
//		Thread.sleep(2000);
//		Runtime.getRuntime().exec("C:\\Users\\abhijeetk\\OneDrive - Winjit Technologies Pvt Ltd\\Desktop\\BoQ_FileImport.exe");
//	}
	
	public void CreateImportBoQs() throws Exception {
		config = new ConfigDataProvider();
		clickOnElement(clickOnCreateImportBoQ);
		Thread.sleep(2000);
		
		//String file1="\"C:\\Users\\abhijeetk\\OneDrive - Winjit Technologies Pvt Ltd\\Documents\\iTWO_5DInstitute\\3.00.02 - 20FEI49580, LV-LT.X83\"";
		//String file2 ="\"C:\\Users\\abhijeetk\\OneDrive - Winjit Technologies Pvt Ltd\\Documents\\iTWO_5DInstitute\\3.00.2 LV-_21_Mannheim Rbf_Teil 2.X83\"";
		
		String AbsPath_1= new File("\"\\DataFiles\\3.00.02 - 20FEI49580, LV-LT.X83\"").getAbsolutePath();
		String AbsPath_2= new File("\"\\DataFiles\\3.00.2 LV-_21_Mannheim Rbf_Teil 2.X83\"").getAbsolutePath();
		
		//String TwoFiles = file1+file2;
		String TwoFiles = AbsPath_1+AbsPath_2;
		uploadFile(TwoFiles);

	}
	
	public static void setClipboardData(String string) {
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	
	public static void uploadFile(String fileLocation) {
        try {
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_CONTROL);
            
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
	}
	
	

	@FindBy (xpath = "//div[text()='CODE01']/following-sibling::div[2]") WebElement AssignModeClick_1;
	@FindBy (xpath = "//li[normalize-space()='Ignore']") WebElement IgnoreClk;
	@FindBy (xpath = "//button[normalize-space()='OK']") WebElement OKClick;
	@FindBy (xpath = "//button[contains(@data-lookup-show,'settings.showEditButton')]") WebElement DropDownArrow;

	public void PopUp_GAEBImport() throws Exception {
		
		SwitchToPopUp();

		for (int i=1;i<=2;i++) {
			WebElement AssignModeClick = driver.findElement(By.xpath("//div[text()='CODE0"+i+"'"+"]/following-sibling::div[2]"));
			Thread.sleep(1000);
			clickOnElement(AssignModeClick);
			clickOnElement(DropDownArrow);
			Thread.sleep(1000);
			clickOnElement(IgnoreClk);

		}
		clickOnElement(OKClick);
		driver.switchTo().defaultContent();

	}

	@FindBy (xpath = "//button[normalize-space()='OK']")  WebElement OKClick_2;
	public void Conf_GAEBImport() throws Exception {
		Thread.sleep(3000);
		SwitchToPopUp();
		Thread.sleep(3000);
		clickOnElement(OKClick_2);
		driver.switchTo().defaultContent();
	}

	@FindBy (xpath = "//button[normalize-space()='Yes']") WebElement YesClick;
	public void QuestionPoPUp() throws Exception {
		Thread.sleep(3000);
		SwitchToPopUp();
		Thread.sleep(3000);
		clickOnElement(YesClick);
		driver.switchTo().defaultContent();
	}

	//Next GAEB Import
	@FindBy (xpath = "//div[text()='CODE01']/following-sibling::div[2]") WebElement row_1;
	@FindBy (xpath = "//div[text()='CODE02']/following-sibling::div[2]") WebElement row_2;
	@FindBy (xpath = "//div[text()='work category']/following-sibling::div[text()='CODE01']/following-sibling::div[2]") WebElement row_3;
	@FindBy (xpath = "//div[text()='cost group DIN 276-93']/following-sibling::div[5]") WebElement row_4;
	@FindBy (xpath = "//div[text()='cost group DIN 276-1 2008-12']/following-sibling::div[5]") WebElement row_5;
	@FindBy (xpath = "//button[contains(@title,'Wizard')]") WebElement WizardCloseClick;
	public void PopUp_2_GEABImport() throws Exception {
		Thread.sleep(3000);
		SwitchToPopUp();
		Thread.sleep(1000);
		clickOnElement(row_3);
		clickOnElement(DropDownArrow);
		clickOnElement(IgnoreClk);
		Thread.sleep(1000);
		clickOnElement(row_4);
		clickOnElement(DropDownArrow);
		clickOnElement(IgnoreClk);
		Thread.sleep(1000);
		clickOnElement(row_5);
		clickOnElement(DropDownArrow);
		clickOnElement(IgnoreClk);
		Thread.sleep(1000);
		clickOnElement(OKClick);
		Thread.sleep(2000);
		clickOnElement(WizardCloseClick);
		driver.switchTo().defaultContent();

	}

	@FindBy (xpath = "//div[@id='ac4a13a8f33540ed80d0d9f67983fa01']/div[4]/div[3]/div[1]/div[3]/div/div[1]") WebElement SelectBoQ_1;
	@FindBy (xpath = "//button[contains(@title,'Open BoQ')]") WebElement GoToBoQ;
	public void GoToBoQ_1() throws Exception {
		clickOnElement(SelectBoQ_1);
		clickOnElement(GoToBoQ);
		Thread.sleep(3000);
	}


	@FindBy (xpath = "//div[contains(@data-ng-animate,\"{enter: 'animate-enter', leave: 'animate-leave'}\")]//li[4]//button[1]") WebElement DeleteBoQ;
	@FindBy (xpath ="//button[@title='Unsaved Data']") WebElement UnsavedClick;
	
	public void DeleteAllBoQs() throws Exception {
		for (int i=1; i<=2;i++) {
			clickOnElement(SelectBoQ_1);
			Thread.sleep(2000);
			clickOnElement(DeleteBoQ);
			Thread.sleep(2000);
			SwitchToPopUp();
			Thread.sleep(2000);
			clickOnElement(YesClick);
			driver.switchTo().defaultContent();
		}
	}
	public void SaveChanges() throws Exception {
		Thread.sleep(2000);
		clickOnElement(UnsavedClick);
	}
}

