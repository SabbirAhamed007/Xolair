package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", glue = { "stEPdeFinatiOn" }, plugin = { "html:target/cucumber-html-report",
		"json:target/cucumber.json", "pretty:target/cucumber-pretty.txt", "usage:target/cucumber-usage.json",
		"junit:target/cucumber-results.xml" }, tags = { "@tag4" })

public class Patient_Combu_EnrollmentRunner {

}
