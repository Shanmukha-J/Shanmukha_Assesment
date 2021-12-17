package framework.pageobjects;

//import java.util.LinkedList;
import java.util.List;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPO {

	WebDriver driver;

	public SearchResultsPO(WebDriver driver) {
		this.driver = driver;
		
		/* Page class Factory : init */

		PageFactory.initElements(this.driver, this);
	}

//	By searchResults = By.cssSelector("span.a-size-medium.a-color-base.a-text-normal");

	/* Page class factory @FindBy */

	@FindBy(css = "span.a-size-medium.a-color-base.a-text-normal")
	private List<WebElement> searchResults;

	public List<WebElement> returnSearchResultsList() {
		return searchResults;
	}

//	public List<String> getlistProdNames(){
//		List<String> searchResultPoductNames= new LinkedList<String>();
//		List<WebElement> oList = driver.findElements(searchResults);
//		for(WebElement oelem:oList) {
//			String prodNameString=oelem.getText();
//			searchResultPoductNames.add(prodNameString);
//		}
//		return searchResultPoductNames;
//	}

}
