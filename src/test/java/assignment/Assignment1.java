package assignment;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class Assignment1 {
	private WebDriver driver;
	private WebDriverManager webDrbMng;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?gws_rd=ssl");

	}

	@Test
	public void Assignment1_Test() {

		System.out.println("Header of the page : " + driver.getTitle());
		System.out.println("URl : " + driver.getCurrentUrl());

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
