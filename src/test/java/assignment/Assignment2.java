package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class Assignment2 {
	
	private WebDriver driver;
	private WebDriverManager webDrbMng;
	SoftAssert sf;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

	}
	

	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test
	public void Assignment2_Test() {
		
		driver.findElement(By.id("isAgeSelected")).click();
		String value1= driver.findElement(By.id("txtAge")).getText();
		sf.assertEquals(value1, "Success - Check box is checked");
		
		driver.findElement(By.id("isAgeSelected")).click();
		String value2= driver.findElement(By.id("txtAge")).getText();
		sf.assertEquals(value2, "");
		
		driver.findElement(By.id("check1")).click();
		String value3= driver.findElement(By.id("isChkd")).getAttribute("value");
		System.out.println(value3);
		sf.assertEquals(value3, "true");
		
		sf.assertAll();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
