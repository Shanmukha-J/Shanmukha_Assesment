package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Pckg2_Class3 {

	@Test(priority = 1)
	public void create() {
		System.out.println("testng.pckg2 Class1 create ");
	}

	@Test(priority = 3)
	public void delete() {
		System.out.println("testng.pckg2 Class1 delete ");
	}

	@Test(priority = 2)
	public void update() {
		System.out.println("testng.pckg2 Class1 update ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("testng.pckg2 Class1 beforeClass ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("testng.pckg2 Class1 afterClass ");
	}

}
