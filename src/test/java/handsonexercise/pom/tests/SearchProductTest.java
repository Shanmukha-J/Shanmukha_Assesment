package handsonexercise.pom.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import handsonexercise.pom.pageobjects.HomePagePO;
import handsonexercise.pom.pageobjects.SearchResultsPO;
import utilities.selenium.WebDriverManager;

public class SearchProductTest {

	private WebDriver driver;
	private WebDriverManager webDrbMng;
	SoftAssert sf;
	HomePagePO search;
	SearchResultsPO productNames;

	@BeforeClass
	public void setUp() throws Exception {
		webDrbMng = new WebDriverManager();
		driver = webDrbMng.launchBrowser("chrome");
		search = new HomePagePO(driver);
		productNames = new SearchResultsPO(driver);
		driver.get("https://www.amazon.in/");
	}

	@BeforeMethod
	public void Setting() {
		sf = new SoftAssert();
	}

	@Test
	public void SearchProductTestmethod() {
		String product= "iphone";
		search.searchForProduct(product);

		List<String> listOfProducts = productNames.getlistProdNames();
		for (String str : listOfProducts) {

			 sf.assertTrue(str.toLowerCase().contains(product.toLowerCase()), "Fail| product didn't match "+str+" with "+product);
		}
		sf.assertAll();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
