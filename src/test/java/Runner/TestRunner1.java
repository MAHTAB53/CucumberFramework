package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features ="src/test/java/Feature",
		glue = "StepDefinitions",
		tags = {"@Regression"}
		)

public class TestRunner1 extends AbstractTestNGCucumberTests {

}
