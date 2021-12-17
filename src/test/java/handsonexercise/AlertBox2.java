package handsonexercise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.selenium.WebDriverManager;

public class AlertBox2 {
	private WebDriver driver;
	private WebDriverManager webDrbMng;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		wait = new WebDriverWait(driver, 120);
		driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
	}

	@Test
	public void alertCheck() throws InterruptedException {
		driver.findElement(By.xpath("//p[@id='confirm-demo']//..//button[@class='btn btn-default btn-lg']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.id("confirm-demo"));
	//	WebElement ele = driver.findElement(By.xpath("//p[@id='confirm-demo']"));
		String message = ele.getText();
		Assert.assertEquals(message, "You pressed OK!");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
