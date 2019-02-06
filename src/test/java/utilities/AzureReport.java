package utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class AzureReport {

	public static void generateReport()
	{
		File reportOutputDirectory = new File("/Users/aniketmalusare/eclipse-workspace/karatedemo/target/AzureReports/");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("/Users/aniketmalusare/eclipse-workspace_navin/karatedemo/target/cucbumber-html-report/Cucumber.json");
		
		String buildNumber = "1";
		String projectName = "cucumberProject";
		boolean runWithJenkins = true;
		
		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Firefox");
		configuration.addClassifications("Branch", "release/1.0");
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();
	}
	
}
