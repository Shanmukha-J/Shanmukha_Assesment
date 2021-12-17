package testng.pckg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Pckg1_Class1 {

	@Test(priority = 1)
	public void Test1() {
		System.out.println("testng.pckg1 Class1 Test1 ");
	}

	@Test(priority = 3)
	public void Test3() {
		System.out.println("testng.pckg1 Class1 Test3 ");
	}

	@Test(priority = 2)
	public void Test2() {
		System.out.println("testng.pckg1 Class1 Test2 ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("testng.pckg1 Class1 beforeClass ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("testng.pckg1 Class1 afterClass ");
	}

}
