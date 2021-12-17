package selenuim.assertions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class HardAssert {
	
	WebDriver driver;
	WebDriverManager webDrbMng;
	
	@BeforeClass
	public void setUp() {
		webDrbMng= new WebDriverManager();
		driver=webDrbMng.launchBrowser("chrome");
		driver.get("https://www.google.in");
	}
	
	@Test
	public void checkTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
