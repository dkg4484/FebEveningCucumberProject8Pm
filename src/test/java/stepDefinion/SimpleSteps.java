package stepDefinion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SimpleSteps {

	// <6 --> Cucumber Expression --> Regular Expression

	@Given("I have {long} brothers and {long} sister") // Cucumber Expression
	public void i_have_brothers_and_sister(long i1, long i2) {

		System.out.println("Long=====");

		System.out.println(i1 + " " + i2);
	}

	/*
	 * @Given("I have {int} brothers and {int} sister") // Cucumber Expression
	 * public void i_have_brothers_and_sister(int i1, int i2) {
	 * 
	 * System.out.println("Int======");
	 * 
	 * System.out.println(i1 + " " + i2); }
	 */
	@When("My brother name is {string} and Sister name is {string}")
	public void my_brother_name_is_and_sister_name_is(String s1, String s2) {

		System.out.println(s1 + " " + s2);

	}

	@When("{string} is getting {float} lakhs per annum")
	public void is_getting_lakhs_per_annum(String s1, float d1) {

		System.out.println(s1 + " " + d1);
	}

	@When("Anitha initail is {string}")
	public void anitha_initail_is(String ch) {
		System.out.println(ch);
	}

}
