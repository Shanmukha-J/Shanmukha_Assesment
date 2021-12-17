package testng.dataprovider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name = "data-provider")
	public static Object[][] dpMethod() {
		return new Object[][] { { "Shanmukha" }, { "Sachin" }, { "Vivek" }, { "Jaskirat" } };
	}

	@DataProvider(name = "data-provider1")
	public static Object[][] dpMethod1() {
		return new Object[][] { { 1, 2 }, { 2, 2 }, { 3, 4 } };
	}

}
