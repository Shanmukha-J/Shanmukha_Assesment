package testng.dataprovider;

import org.testng.annotations.Test;

public class DPClass {
	@Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class )
	public void dataProviderTest(String input) {

		System.out.println("Name is = " + input);
	}

	@Test(dataProvider = "data-provider1",dataProviderClass = DataProviderClass.class)
	public void dataProviderTest1(int num1, int num2) {

		System.out.println("sum is = " + num1 + num2);
	}

}
