package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
				glue = "stepDefinations",
				tags = "@tag",
				dryRun = false,
				monochrome = true,
				plugin = {"pretty", "html:target/cucumber.html",
						"json:target/cucumber.json",
						"junit:target/cucumber.xml"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
