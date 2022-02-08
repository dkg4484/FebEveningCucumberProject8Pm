package stepDefinion;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemoSteps {

	static WebDriver driver;

	@Given("the user launches the particular url {string}")
	public void the_user_launches_the_particular_url(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("the user sends username {string} and password {string}")
	public void the_user_sends_username_and_password(String username, String password) {

		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {

		driver.findElement(By.id("login-button")).click();

	}

	@Then("the user should verifies the url of the webpage {string}")
	public void the_user_should_verifies_the_url_of_the_webpage(String expUrl) {

		Assert.assertEquals(expUrl, driver.getCurrentUrl());

	}

	@When("the user finding the highest pricing product")
	public void the_user_finding_the_highest_pricing_product() {

		// Stream API

		List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

		/*
		 * double maxPrice = prices.stream().mapToDouble((e) ->
		 * Double.parseDouble(e.getText().trim().replace("$", "")))
		 * .max().getAsDouble();
		 */

		double maxPrice = 0;

		for (WebElement price : prices) {

			double price1 = Double.parseDouble(price.getText().trim().replace("$", "")); // 49.99

			if (maxPrice < price1) {

				maxPrice = price1; // 49.99

			}

		}

		String xpath = "//div[normalize-space()='$" + maxPrice + "']/following-sibling::button";

		driver.findElement(By.xpath(xpath)).click();

	}

	@When("the user finding the lowest pricing product")
	public void the_user_finding_the_lowest_pricing_product() {

		// Stream API

		List<WebElement> prices = driver.findElements(By.className("inventory_item_price"));

		double minPrice = prices.stream().mapToDouble((e) -> Double.parseDouble(e.getText().trim().replace("$", "")))
				.min().getAsDouble();

		/*
		 * double maxPrice = 0;
		 * 
		 * for (WebElement price : prices) {
		 * 
		 * double price1 = Double.parseDouble(price.getText().trim().replace("$", ""));
		 * // 49.99
		 * 
		 * if (maxPrice < price1) {
		 * 
		 * maxPrice = price1; // 49.99
		 * 
		 * }
		 * 
		 * }
		 */

		String xpath = "//div[normalize-space()='$" + minPrice + "']/following-sibling::button";

		driver.findElement(By.xpath(xpath)).click();

	}

	@Then("the user should validate this prodcut by checking the remove button")
	public void the_user_should_validate_this_prodcut_by_checking_the_remove_button() {

		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Remove']")).isDisplayed());

	}

}
