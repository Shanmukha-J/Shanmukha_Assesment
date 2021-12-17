package framework.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import framework.functionlibrary.HomePageLib;
import framework.functionlibrary.NewProductPageLib;
import utilities.selenium.WebDriverManager;
import utilities.selenium.WebDriverUtilities;

public class Assignment4 {

	WebDriver driver;
	WebDriverManager WebDrvMgr;
	private HomePageLib homPaglib;
	private NewProductPageLib newproductlib;
	WebDriverWait wait;
	WebDriverUtilities webDrvUtil;
	SoftAssert sf;
	
	
	@BeforeClass
	public void setUp() {
		// Invoke web browser
		WebDrvMgr = new WebDriverManager();
		driver = WebDrvMgr.launchBrowser("Chrome");
		wait = new WebDriverWait(driver, 120);
		webDrvUtil = new WebDriverUtilities(driver);
		driver.get("https://www.amazon.in/");
	}

	@BeforeMethod
	public void preReq() {
		sf = new SoftAssert();
	}

	@Test
	public void addTheprodctToCartTest() {
		
		// First time
		homPaglib = new HomePageLib(driver);
		homPaglib.searchForProduct("iPhone");
		
		webDrvUtil.switchWindow();
		newproductlib = new NewProductPageLib(driver);

		String value1=  newproductlib.addProductToCart();
		sf.assertEquals(value1, "Added to Cart", " The product has not been added : Not added");

		driver.close();
		webDrvUtil.switchWindow();
		
		// second time
		
	//	homPaglib = new HomePageLib(driver);
		homPaglib.searchForProduct("oneplus nord");
		
		webDrvUtil.switchWindow();
		newproductlib = new NewProductPageLib(driver);

		String value2=  newproductlib.addProductToCart();
		sf.assertEquals(value2, "Added to Cart", " The product has not been added : Not added");

		driver.close();
		webDrvUtil.switchWindow();
		sf.assertAll();
	}
	
	@AfterClass
	public void cleanUp() {
		driver.close();
	}
}
