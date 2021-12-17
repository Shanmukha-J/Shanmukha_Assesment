package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class Assignment3 {
	

	private WebDriver driver;
	private WebDriverManager webDrbMng;
	SoftAssert sf;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/");

	}
	

	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test
	public void Assignment3_Test() {
		
	//	driver.findElement(By.xpath("//div[@class='navbar-brand navbar-brand-centered']/a")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[@class='dropdown open']")).click();
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//li[@class='dropdown open']//ul[@class='dropdown-menu']//a[text()=\"Table Pagination\"]")).click();
		

		
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
