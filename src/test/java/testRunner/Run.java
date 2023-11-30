package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features =".//Features/CustomerPage.feature",
		glue = "stepDefination",
		dryRun = false,
		monochrome = false,
		plugin = {"pretty","html:target/cucumber-reports/reports1.html"}
		)
public class Run {
/* this class will be empty ok */
}
