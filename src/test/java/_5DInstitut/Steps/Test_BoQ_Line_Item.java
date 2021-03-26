package _5DInstitut.Steps;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import _5DInstitut.ConfigReader.ConfigDataProvider;
import _5DInstitut.testContext.BaseClass;
import _5DInstitut.testContext.TestContextUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_BoQ_Line_Item extends BaseClass {
	TestContextUI testContextUI;
	public ConfigDataProvider config;

	public Test_BoQ_Line_Item(TestContextUI testContextUI) {
		this.testContextUI = testContextUI;
	}

	@Given("Darwin web app launching")
	public void A_darwin_web_app_launching_01() {
		config = new ConfigDataProvider();
		driver.get(config.getStagingURL());
		testContextUI.setDriver(driver);
		testContextUI.initializePageObjectClasses(driver);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@When("Login the application using valid credentials")
	public void B_login_the_application_using_valid_credentials_02() throws Exception {
		testContextUI.getLoginPage().LoginToDesktop(config.getUsername(), config.getPassword());
		testContextUI.getLoginPage().ClickLogin();
	}
	@Then("Selecting the a company and access role")
	public void C_selecting_the_a_company_and_access_role_03() {
		testContextUI.getLoginPage().SelectCompany();
	}

	@When("Open the Project Management Module")
	public void D_open_the_Project_Management_Module_04() {
		testContextUI.getHomePage().OpenProjectModule();
	}

	@When("Open the BoQ module")
	public void E_open_the_BoQ_module_05() {
		testContextUI.getBoQPage().SelectBoQ();
	}

	@When("Refesh the page to load the projects")
	public void F_refesh_the_page_to_load_the_projects_06() throws Exception {
		Thread.sleep(3000);
		testContextUI.getBoQPage().RefreshProject();
	}

	@When("Select the Wizard from sidebar")
	public void G_select_the_Wizard_from_sidebar_07() throws Exception {
		Thread.sleep(3000);
		testContextUI.getBoQPage().OpenWizard();
	}

	@When("Click on Create and Import multiple BoQs")
	public void H_click_on_Create_and_Import_multiple_BoQs_08() throws Exception {
		Thread.sleep(3000);
		testContextUI.getBoQPage().CreateImportBoQs();
		Thread.sleep(6000);
	}

	@When("Choose multiple BoQs form the Computer and Import")
	public void I_choose_multiple_BoQs_form_the_Computer_and_Import_09() {
		System.out.println("File is imported");
	}

	@When("Marked Assignment Mode against every GAEB Name and submit")
	public void J_marked_Assignment_Mode_against_every_GAEB_Name_and_submit_10() throws Exception {
		testContextUI.getBoQPage().PopUp_GAEBImport();
	}

	@When("Confirm the GAEB Import")
	public void K_confirm_the_GAEB_Import_11() throws Exception {
		testContextUI.getBoQPage().Conf_GAEBImport();

	}

	@When("Accept the Error and Continue")
	public void L_accept_the_Error_and_Continue_12() throws Exception {
		testContextUI.getBoQPage().QuestionPoPUp();
	}

	@When("Again Marked Assignment Mode against every GAEB Name and submit")
	public void M_again_marked_Assignment_Mode_against_every_GAEB_Name_and_submit_13() throws Exception {
		testContextUI.getBoQPage().PopUp_2_GEABImport();
		testContextUI.getBoQPage().Conf_GAEBImport();
	}

	@When("Go to the BoQ and back to {string} from Quick Start")
	public void N_go_to_the_BoQ_and_back_to_project_from_Quick_Star_14(String module) throws Exception {
		testContextUI.getBoQPage().GoToBoQ_1();
		testContextUI.getQuickStartPage().SearchModule(module);
		//		testContextUI.getBoQPage().GoToBoQ_2();
		//		testContextUI.getQuickStartPage().SearchModule(module);
	}

	@When("Select and Delete the BoQ")
	public void O_select_and_Delete_the_BoQ_15() throws Exception {
		testContextUI.getBoQPage().DeleteAllBoQs();
	}
	@Then("Save the changes")
	public void P_save_the_changes_16() throws Exception {
		testContextUI.getBoQPage().SaveChanges();
	}
	@Then("Logout the Application")
	public void Q_logout_the_Application_17() throws Exception {
		testContextUI.getLogoutPage().CloseProjectModule();
		testContextUI.getLogoutPage().LogoutApp();

	}

}
