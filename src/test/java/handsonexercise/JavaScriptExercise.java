package handsonexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.selenium.WebDriverManager;

public class JavaScriptExercise {

	private WebDriver driver;
	private WebDriverManager webDrbMng;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		
		driver.get("https://demoqa.com/automation-practice-form");
		
	}

	@Test
	public void explicitlyWait() {
		WebElement  websearch = driver.findElement(By.id("uploadPicture"));
		wait.until(ExpectedConditions.elementToBeClickable(websearch));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", websearch);
	
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
