package stepDefinion;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {

	// Cucumber Expression

	@Given("As a customer we launches the amazon {string} url {string}")
	public void As_a_customer_we_launches_the_amazon_url(String env, String url) {

		System.out.println("Environment name is " + env + "The URL is  " + url);

	}

	@When("As a customer we browser the product from the store")
	public void as_a_customer_we_browser_the_product_from_the_store() {

		System.out.println("Mobile========");

	}

	@When("As a customer we click the add to cart button")
	public void as_a_customer_we_click_the_add_to_cart_button() {

		System.out.println("Clicking CART Btn");

	}

	@Then("As a user we done the checkout of {int} ruppes")
	public void as_a_user_we_done_the_checkout_of_ruppes(int price) {

		System.out.println("PRICE " + price);

	}

}
