package objectrepo;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ObjectRepositoryDemo {

	public static void main(String[] args) throws Exception {

		DriverFactory driverFactory = new DriverFactory();
		WebDriver driver = driverFactory.selectBrowser();
		ElementUtils elementUtils = new ElementUtils(driver);

		elementUtils.enterText("uname", ElementUtils.readPropertyFile("username"));
		elementUtils.enterText("pwd", ElementUtils.readPropertyFile("password"));
		elementUtils.click("login");

		Assert.assertEquals("My Account", driver.getTitle());

	}

}
