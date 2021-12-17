package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.selenium.WebDriverManager;

public class LaunchBrowserUsingWebDriverManager {

	@Test
	public void launchEdgeBrowser() throws Exception {
		WebDriver driver;
		WebDriverManager webManDri = new WebDriverManager();
		driver=webManDri.launchBrowser("edge");
		driver.get("https://www.google.in");
		Thread.sleep(2000);
		driver.quit();
	}

}
