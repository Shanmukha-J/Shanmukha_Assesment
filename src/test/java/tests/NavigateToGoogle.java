package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.selenium.WebDriverManager;

public class NavigateToGoogle {
	WebDriver driver;
	WebDriverManager webDrbMng;
	SoftAssert ast;
	
	
	@BeforeClass
	public void setUp() {
		webDrbMng= new WebDriverManager();
		driver=webDrbMng.launchBrowser("chrome");
		driver.get("https://www.google.in");
	}
	
	@BeforeMethod
	public void setup() {
		ast=new SoftAssert();
	}
	
	@Test
	public void navigateToGoogle() {				
		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "Google");
		ast.assertEquals(title, "Google");
		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		ast.assertEquals(currentUrl, "https://www.google.co.in/");
		WebElement oelem = driver.findElement(By.cssSelector("div.uU7dJb"));
		String innertext= oelem.getText();
//		System.out.println(innertext);
		ast.assertEquals(innertext, "India");
		String attribClass = oelem.getAttribute("class");
//		System.out.println(attribClass);
		ast.assertEquals(attribClass, "uU7dJb");
		List<WebElement> oList = driver.findElements(By.cssSelector("div.KxwPGc.AghGtd>*"));
		for(WebElement oElem: oList){
			String innerText = oElem.getText();
			System.out.println(innerText);
		}
		ast.assertAll();
	}
	
	@AfterMethod
	public void clearObjects() {
		ast = null;
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
