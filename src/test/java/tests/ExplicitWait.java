package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class ExplicitWait {

	private WebDriver driver;
	private WebDriverManager webDrbMng;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 1);
		Thread.sleep(2000);
		driver.get("https://www.google.in");
		
	}

	@Test
	public void explicitlyWait() {
		By bysearch = By.cssSelector("input.gLFyf.gsfi");
		wait.until(ExpectedConditions.elementToBeClickable(bysearch));

//		WebElement loc = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
//		wait.until(ExpectedConditions.elementToBeClickable(loc));

		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).clear();
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Seleneium dev");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
