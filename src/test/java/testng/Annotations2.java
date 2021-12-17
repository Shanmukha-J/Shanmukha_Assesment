package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Annotations2 {
	
	
  @Test(priority =1 , groups= {"Welcome"})
  public void test1() {
	  System.out.println("Annotations2 test1");
  }
  @Test(priority =2 , groups= {"Welcome","Hello"})
  public void test2() {
	  System.out.println("Annotations2 test2");
  }
  @Test(priority =3 , groups= {"Hi","Hello"})
  public void test3() {
	  System.out.println("Annotations2 test3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Annotations2 beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Annotations2 afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Annotations2 beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Annotations2 afterClass");
  }

	/*
	 * @BeforeTest public void beforeTest() { System.out.println("beforeTest"); }
	 * 
	 * @AfterTest public void afterTest() { System.out.println("afterTest"); }
	 * 
	 * @BeforeSuite public void beforeSuite() { System.out.println("beforeSuite"); }
	 * 
	 * @AfterSuite public void afterSuite() { System.out.println("afterSuite"); }
	 */

}
