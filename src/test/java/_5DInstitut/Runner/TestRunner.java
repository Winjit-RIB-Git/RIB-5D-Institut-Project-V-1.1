package _5DInstitut.Runner;


import org.testng.annotations.AfterSuite;

import _5DInstitut.ConfigReader.ConfigDataProvider;
import _5DInstitut.Utilities.ReportHelper;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

		features = "src/test/resources/_5DInstitut.Features", 
		glue = {"_5DInstitut.Steps","_5DInstitut.Hooks"}, 
		tags = "@UAT",

		plugin = {"pretty","json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	 
		strict = true,
		monochrome = true
		)

public class TestRunner extends AbstractTestNGCucumberTests  {
	
	@AfterSuite(alwaysRun=true)
	public void generateHTMLReports() {
		ReportHelper.generateCucumberReport();
	}
}
