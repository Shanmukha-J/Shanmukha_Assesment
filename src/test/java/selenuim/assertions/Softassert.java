package selenuim.assertions;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class Softassert {
	WebDriver driver;
	WebDriverManager webDrbMng;
	SoftAssert ast;
	
	@BeforeClass
	public void setUp() {
		webDrbMng= new WebDriverManager();
		driver=webDrbMng.launchBrowser("chrome");
		driver.get("https://www.facebook.com/");
	}
	
	@BeforeMethod
	public void setup() {
		ast=new SoftAssert();
	}
	@AfterMethod
	public void clearObjects() {
		ast = null;
	}
	@Test
	public void Login() {
		ast.assertEquals("email@gmail.com", "email@gmail.com");
		ast.assertEquals("password@123", "password@123");
		ast.assertAll();
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
