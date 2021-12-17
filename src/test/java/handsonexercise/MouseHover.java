package handsonexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

public class MouseHover {
	private WebDriver driver;
	private WebDriverManager webDrbMng;
	WebDriverWait wait;
	WebDriverUtilities webDrvUtil;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		webDrvUtil = new WebDriverUtilities(driver);
		driver.get("https://demoqa.com/menu/");

	}

	@Test
	public void MouseHoverTest() {
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		action.moveToElement(ele).build().perform();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
