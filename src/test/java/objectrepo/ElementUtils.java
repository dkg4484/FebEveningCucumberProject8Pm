package objectrepo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {

	WebDriver driver;

	public ElementUtils(WebDriver driver) {

		this.driver = driver;
	}

	public static String readPropertyFile(String key) {

		File file = new File("./src/test/resources/configuration/config.properties");

		// To give the file location

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// To read the file
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties properties = new Properties();
		// Properties Object

		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return properties.getProperty(key);

	}

	public static String getObjectRepo(String key) throws Exception {

		Properties prop = new Properties();

		prop.load(new FileInputStream(new File("./src/test/resources/configuration/objectrepo.properties")));

		return prop.getProperty(key);

	}

	public WebElement getElement(String key) throws Exception {

		String value = getObjectRepo(key); // name#email
		String[] split = value.split("#");
		String locator = split[0];
		String elementAddress = split[1];

		switch (locator.toUpperCase()) {

		case "ID":

			return driver.findElement(By.id(elementAddress));

		case "NAME":
			return driver.findElement(By.name(elementAddress));

		case "CLASS":
			return driver.findElement(By.className(elementAddress));

		case "TAG":
			return driver.findElement(By.tagName(elementAddress));

		case "XPATH":
			return driver.findElement(By.xpath(elementAddress));

		case "CSS":
			return driver.findElement(By.cssSelector(elementAddress));

		case "LINK":
			return driver.findElement(By.linkText(elementAddress));

		default:
			return driver.findElement(By.partialLinkText(elementAddress));

		}

	}

	public void enterText(String key, String data) throws Exception {

		getElement(key).sendKeys(data);

	}

	public void click(String key) throws Exception {

		getElement(key).click();

	}

}
