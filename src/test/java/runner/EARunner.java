package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Logical OR Operator, Minimum one condition should be satisfied

// Maven CLI Command line interface
//(Cmd)
@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "./src/test/resources/featureFile/AddToCart.feature",
				"./src/test/resources/featureFile/EA2.feature",
				"./src/test/resources/featureFile/EA.feature" }, glue = "stepDefinion", dryRun = false, plugin = "html:HTML/Output.html",

		publish = true,
		monochrome = true
//		tags = "not @Smoke and @EA2"

)

public class EARunner {

}
