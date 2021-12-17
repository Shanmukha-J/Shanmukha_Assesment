package handsonexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class ProgressBarr {
	private WebDriver driver;
	private WebDriverManager webDrbMng;
	WebDriverWait wait;
	SoftAssert sf;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 1);
		driver.get("https://demo.seleniumeasy.com/jquery-download-progress-bar-demo.html");
	}

	@BeforeMethod
	public void testPreReq() {
		sf = new SoftAssert();
	}

	@Test
	public void datePickerTest() {
		driver.findElement(By.id("downloadButton")).click();
		By locator = By.cssSelector("div.progress-label");
		wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, "Complete!"));
		driver.findElement(By.xpath("//div[@class='ui-dialog-buttonset']/button")).click();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
