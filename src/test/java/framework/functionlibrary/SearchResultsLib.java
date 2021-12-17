package framework.functionlibrary;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.pageobjects.SearchResultsPO;

public class SearchResultsLib {
	WebDriver driver;
	SearchResultsPO searchresultspo;

	public SearchResultsLib(WebDriver driver) {
		this.driver = driver;
	}

	public List<String> getListOfProductNamest() {
		searchresultspo = new SearchResultsPO(driver);
		List<WebElement> oList = searchresultspo.returnSearchResultsList();
		List<String> searchResultPoductNames = new LinkedList<String>();
		for (WebElement oelem : oList) {
			String prodNameString = oelem.getText();
			searchResultPoductNames.add(prodNameString);
		}
		return searchResultPoductNames;
	}

	public void clicknthSearchResultLink(int resultNum) {

		searchresultspo = new SearchResultsPO(driver);
		List<WebElement> oList = searchresultspo.returnSearchResultsList();
		oList.get(resultNum - 1).click();
	}
	
	public int returnSearchResultsCount() {
		searchresultspo = new SearchResultsPO(driver);
		List<WebElement> oList = searchresultspo.returnSearchResultsList();
		return oList.size();
	}
	
}
