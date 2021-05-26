package options;

import org.junit.runner.RunWith;
import org.testng.annotations.Listeners;

import com.itestlistener.CustomListener;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@Listeners(CustomListener.class)
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepDefinitions",
        strict = true
//		dryRun = true
//		monochrome = true
//		format =pretty
//      tags = "@PositiveTest"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

	
}
