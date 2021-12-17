package framework.tests;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import framework.functionlibrary.HomePageLib;
import framework.functionlibrary.SearchResultsLib;
import utilities.DataProvider;
import utilities.selenium.WebDriverManager;

public class SearchProductTests {

	WebDriver driver;
	WebDriverManager WebDrvMgr;
	private HomePageLib homPaglib;
	private SearchResultsLib seareslib;
	SoftAssert sf;
	// Test Input
	private String propfile = "src/test/resources/base.prop";
	private String url = DataProvider.getTestData(propfile, "url");
	private String searchParam = DataProvider.getTestData(propfile, "searchParam");

	@BeforeClass
	public void setUp() {
		// Invoke web browser
		WebDrvMgr = new WebDriverManager();
		driver = WebDrvMgr.launchBrowser("Chrome");
		driver.get(url);
	}

	@BeforeMethod
	public void preReq() {
		sf = new SoftAssert();
	}

	@Test
	public void searchProductTest() {
		Reporter.log("Search for product in home page");

		homPaglib = new HomePageLib(driver);
		homPaglib.searchForProduct(searchParam);

		Reporter.log("Verify that all search contain the searched parameter ");
		seareslib = new SearchResultsLib(driver);
		List<String> listProdNames = seareslib.getListOfProductNamest();
		for (String prodName : listProdNames) {
			sf.assertTrue(prodName.toLowerCase().contains(searchParam.toLowerCase()),
					"Fail| Actual product name " + prodName + " doesn't contain the search parameter " + searchParam);
		}
		sf.assertAll();
	}
	
	@AfterClass
	public void cleanUp() {
		driver.close();
	}
}
