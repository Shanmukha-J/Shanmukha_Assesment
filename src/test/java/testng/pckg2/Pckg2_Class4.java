package testng.pckg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Pckg2_Class4 {
	@Test
	public void a_create() {
		System.out.println("testng.pckg2 Class2 a_create ");
	}

	@Test
	public void c_delete() {
		System.out.println("testng.pckg2 Class2 c_delete ");
	}

	@Test
	public void b_update() {
		System.out.println("testng.pckg2 Class2 b_update ");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("testng.pckg2 Class2 beforeClass ");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("testng.pckg2 Class2 afterClass ");
	}

}
