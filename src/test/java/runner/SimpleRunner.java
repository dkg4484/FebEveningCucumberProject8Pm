package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./src/test/resources/featureFile/SimpleDataDriven.feature", 
		glue = "stepDefinion", 
		dryRun = false, 
		plugin = {"html:HTML/op.html", "pretty"})

public class SimpleRunner {

}
