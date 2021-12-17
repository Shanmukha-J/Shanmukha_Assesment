package framework.functionlibrary;

import org.openqa.selenium.WebDriver;

import framework.pageobjects.NewProductPagePO;

public class NewProductPageLib {

	WebDriver driver;
	NewProductPagePO newpagepo;
	
	public NewProductPageLib(WebDriver driver) {
		this.driver = driver;
	}
	
	public String addProductToCart() {
		newpagepo = new NewProductPagePO(driver);
		newpagepo.clickOnAddToCart();
		return newpagepo.addToCartText(); //  Added to Cart       if not   Not added
	}
}
