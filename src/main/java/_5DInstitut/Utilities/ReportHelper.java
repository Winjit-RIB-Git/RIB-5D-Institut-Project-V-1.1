package _5DInstitut.Utilities;

import java.io.File;
import java.util.ArrayList;

import _5DInstitut.ConfigReader.ConfigDataProvider;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportHelper {
	public static ConfigDataProvider config;

    public static void generateCucumberReport() {
		config = new ConfigDataProvider();
        File reportOutputDirectory = new File("target");
        ArrayList<String> jsonFiles = new ArrayList<String>();
        jsonFiles.add("target/cucumber.json");

        String projectName = "RIB.5D_Institut.Project_V-01";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.addClassifications("Platform", System.getProperty("os.name"));
        configuration.addClassifications("Browser", config.getBrowser());
        configuration.addClassifications("Release", config.getVersion());
        configuration.addClassifications("Project URL", config.getStagingURL());

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
        reportBuilder.generateReports();
    }
}
