package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test (dependsOnMethods = "test2")
  public void test1() {
	  System.out.println("test1");
  }
  @Test (dependsOnMethods = "test3")
  public void test2() {
	  System.out.println("test2");
	//  Assert.fail();
  }
  @Test (priority=1)
  public void test3() {
	  System.out.println("test3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("beforeTest");
//  }
//
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("afterTest");
//  }
//
//  @BeforeSuite
//  public void beforeSuite() {
//	  System.out.println("beforeSuite");
//  }
//
//  @AfterSuite
//  public void afterSuite() {
//	  System.out.println("afterSuite");
//  }

}
