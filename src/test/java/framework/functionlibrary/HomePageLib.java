package framework.functionlibrary;

import org.openqa.selenium.WebDriver;

import framework.pageobjects.HomePagePO;

public class HomePageLib {
	WebDriver driver;
	HomePagePO homopagepo;

	public HomePageLib(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchForProduct(String searchParam) {
		homopagepo = new HomePagePO(driver);
		homopagepo.enterValueInSearchBar(searchParam);
		homopagepo.clickSearchBtn();
		homopagepo.clickOnTheSearchedProduct();
	}
	

}
