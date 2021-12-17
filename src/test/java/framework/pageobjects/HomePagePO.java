package framework.pageobjects;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

	WebDriver driver;

	public HomePagePO(WebDriver driver) {
		this.driver = driver;

		/* Page class Factory : init */

		PageFactory.initElements(this.driver, this);
	}

//	private By searchBar = By.id("twotabsearchtextbox");
//	private By submitBtn = By.id("nav-search-submit-button");

	/* Page class factory @FindBy */

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBar;

	@FindBy(id = "nav-search-submit-button")
	private WebElement submitBtn;
	
	

	public void enterValueInSearchBar(String searchParam) {
		searchBar.clear();
		searchBar.sendKeys(searchParam);
//		driver.findElement(searchBar).clear();
//		driver.findElement(searchBar).sendKeys(searchParam);
	}

	public void clickSearchBtn() {

		submitBtn.click();
//		driver.findElement(submitBtn).click();
	}

	public void clickOnTheSearchedProduct() {
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	}
}
