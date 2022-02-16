package stepDefinion;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExamplesSteps {

	WebDriver driver;

	@Given("I launch the url {string}")

	public void i_launch_the_url(String url) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		System.out.println("Amazon login");

	}

	@When("I send the {string} and {string}")
	public void i_send_the_and(String string, String string2) {

		driver.findElement(By.name("email")).sendKeys(string);
		driver.findElement(By.name("pass")).sendKeys(string2);

	}

	/*
	 * @When("I send the {string} and {string}") public void i_send_the_and(String
	 * string, String string2) {
	 * 
	 * driver.findElement(By.name("email")).sendKeys(string);
	 * driver.findElement(By.name("pass")).sendKeys(string2);
	 * 
	 * System.out.println(string + " " + string2);
	 * 
	 * }
	 */
	@When("I click the login button")
	public void i_click_the_login_button() {

		driver.findElement(By.name("login")).click();

		System.out.println("HomePage");

	}

	@Then("I do the assertion for the title")
	public void i_do_the_assertion_for_the_title() {

		Assert.assertEquals("Log in to Facebook", driver.getTitle()); // Hard Assert

		driver.close();

	}

	@When("I send the username {string}")
	public void i_send_the_username(String string) {
		System.out.println("UN " + string);
		driver.findElement(By.name("email")).sendKeys(string);

	}

	@When("I send the password {string}")
	public void i_send_the_password(String string) {

		driver.findElement(By.name("pass")).sendKeys(string);

	}

}
