package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./src/test/resources/featureFile/DataTable.feature", 
		glue = "stepDefinion", 
		plugin = {
				"html:OUTPUT/op.html" }, 
		dryRun = false

)

public class DataTableRunner {

}
