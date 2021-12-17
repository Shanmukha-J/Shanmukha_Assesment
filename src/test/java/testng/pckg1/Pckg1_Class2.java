package testng.pckg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Pckg1_Class2 {
	@Test
	public void Test1() {
		System.out.println("testng.pckg1 Class2 Test1 ");
	}

	@Test
	public void Test2() {
		System.out.println("testng.pckg1 Class2 Test2 ");
	}

	@Test
	public void Test3() {
		System.out.println("testng.pckg1 Class2 Test3 ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("testng.pckg1 Class2 beforeClass ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("testng.pckg1 Class2 afterClass ");
	}

}
