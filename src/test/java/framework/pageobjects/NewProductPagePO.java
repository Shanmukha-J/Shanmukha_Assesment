package framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProductPagePO {
	
	WebDriver driver;

	public NewProductPagePO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id = "add-to-cart-button")
	private WebElement addToCartbtn;

	@FindBy(xpath = "//div[@id='attachDisplayAddBaseAlert']//h4")
	private WebElement addToCarttext;
	
	public void clickOnAddToCart() {
		addToCartbtn.click();
	}

	public String addToCartText() {
		return addToCarttext.getText();
	}

}
