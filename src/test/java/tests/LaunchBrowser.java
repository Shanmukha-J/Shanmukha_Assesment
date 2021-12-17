package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	@Test
	public void launchEdgeBrowser() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.google.in");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void launchChromeBrowser() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void launchFirefoxBrowser() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(1000);
		driver.quit();
	}
	
}
