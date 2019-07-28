package com.oa.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("f@Test");
  }
  @Test
  public void f1() {
	  System.out.println("f1@Test");
  }
  @Test
  public void f2() {
	  System.out.println("f2@Test");
  }
  @Test
  public void f3() {
	  System.out.println("f3@Test");
  }
  @Test
  public void f4() {
	  System.out.println("f4@Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }

}
