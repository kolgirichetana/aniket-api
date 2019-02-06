package examples.users;

import com.intuit.karate.junit4.Karate;

import cucumber.api.CucumberOptions;
import utilities.AzureReport;

import java.net.MalformedURLException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@CucumberOptions(
		plugin= {"pretty","json:target/cucumber-html-report/Cucumber.json"})
public class UsersRunner {
	
	@BeforeClass
    public  static void setup() throws MalformedURLException {
			AzureReport.generateReport();
    }
	
}