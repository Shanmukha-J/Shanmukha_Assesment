package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class CrossBrowser {
	WebDriver driver;
	WebDriverManager webDrbMng;
	SoftAssert ast;
	
	@Parameters({"browser"})
	@BeforeClass
	public void setUp(@Optional("chrome") String browser) {
		webDrbMng= new WebDriverManager();
		driver=webDrbMng.launchBrowser(browser);
		
	}
	
	
	@Test
	public void navigateToGoogle() {				
		driver.get("https://www.google.in");
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
