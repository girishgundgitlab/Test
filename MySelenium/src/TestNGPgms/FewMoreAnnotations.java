package TestNGPgms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FewMoreAnnotations {
	
	//Annotations -- @BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod, @Test, @AfterMethod, @AfterTest, @AfterClass, @AfterSuite
	
	
	@BeforeSuite
	public void beforeSuitemethod()
	{
		System.out.println("This is beforeSuitemethod method");
	}
	
	@BeforeTest
	public void beforeTestmethod()
	{
		System.out.println("This is beforeTestmethod method");
	}
	
	@BeforeClass
	public void beforeClassmethod()
	{
		System.out.println("This is beforeClassmethod method");
	}
	
	@AfterClass
	public void afterClassmethod()
	{
		System.out.println("This is afterClassmethod method");
	}
	
	@AfterSuite
	public void afterSuitemethod()
	{
		System.out.println("This is afterSuitemethod method");
	}
	
	@AfterTest
	public void afterTestemethod()
	{
		System.out.println("This is afterTestemethod method");
	}
	
	@Test  //TestCase
	public void m1() {
		System.out.println("This is @Test m1 method");
//		method1();
	}
	
	@Test  //TestCase
	public void m2() {
		System.out.println("This is @Test m2 method");
//		method1();
	}
	
	@Test  //TestCase
	public void m3() {
		System.out.println("This is @Test m3 method");
//		method1();
	}
	
	public void method1() {
		System.out.println("This is method1 method");
	}
	
	
	@AfterMethod
	public void AfterMethodmethod() {
		System.out.println("This is afterMethod method");
	}

	@BeforeMethod
	public void beforem1()
	{
		System.out.println("This is beforeMethod method");
	}
}
