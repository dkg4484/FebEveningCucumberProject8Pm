package stepDefinion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EA {

	@Given("user launches the url")
	public void user_launches_the_url() {

		System.out.println("user launches the url");

	}

	@When("user enters username {string}")
	public void user_enters_username(String string) {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("user enters username {string}");

	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
		// Write code here that turns the phrase above into concrete actions

		System.out.println(":user enters password {string}");

	}

	@When("user clicks Log in button")
	public void user_clicks_log_in_button() {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("user clicks Log in button");

	}

	@Then("user verifies the title")
	public void user_verifies_the_title() {
		// Write code here that turns the phrase above into concrete actions

	}

	@When("user cliks Employee Details")
	public void user_cliks_employee_details() {

	}

	@Then("user verifies the headers")
	public void user_verifies_the_headers(io.cucumber.datatable.DataTable dataTable) {

		System.out.println("user verifies the headers");

	}

	@When("user cliks Employee List")
	public void user_cliks_employee_list() {

		System.out.println("user cliks Employee List");

	}

	@Then("user verifies employee list headers")
	public void user_verifies_employee_list_headers(io.cucumber.datatable.DataTable dataTable) {

		System.out.println("user verifies employee list headers");

	}

	@When("user cliks Manage users")
	public void user_cliks_manage_users() {

		System.out.println("user cliks Manage users");

	}

	@Then("user verifies Manage users headers")
	public void user_verifies_manage_users_headers(io.cucumber.datatable.DataTable dataTable) {

		System.out.println("user verifies Manage users headers");

	}

}
