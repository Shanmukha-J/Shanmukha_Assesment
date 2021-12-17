package handsonexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class Frames {
	private WebDriver driver;
	private WebDriverManager webDrbMng;
	WebDriverWait wait;
	SoftAssert sf;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("https://demoqa.com/frames");
	}

	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test
	public void framesTest() {

		driver.switchTo().frame("frame1");
		String header= driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(header);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
