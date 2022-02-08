package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./src/test/resources/featureFile/SauceDemo.feature", // To mention the path of the feature file
																			// location
		glue = "stepDefinion", // To give step definition package name
		dryRun = false, // Compare feature file steps with the SD Class. Note it will not allow us to
						// execute the SD class, If single step missed, it will make entire suite as an
						// Error
		plugin = { "pretty", "html:HTML_OUT/output.html", "junit:XML_OUT/output.xml", "json:JSON_OUT/output.json" }, // To
																														// generate
		// PRETTY --> To generate reports inside the console
		monochrome = true // To remove unwanted symbols from the console report
//		tags = "@LowestPricingProduct" // To filter or execute the particular scenario

)

public class TestRunner {

}
