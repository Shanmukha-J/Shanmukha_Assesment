package handsonexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

public class SwitchWindow {
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
		driver.get("https://demoqa.com/browser-windows/");

	}

	@Test
	public void SwitchWindowTest() {
		driver.findElement(By.id("tabButton")).click();
		webDrvUtil.switchWindow();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		webDrvUtil.switchWindow();
		driver.findElement(By.id("tabButton")).click();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
