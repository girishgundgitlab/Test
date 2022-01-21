package TestNGPgms;

import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HowToSkipTCs {
	
	
	@Test
	public void login()
	{
		System.out.println("This is login method");
	}	
	
	
	@Test(dependsOnMethods="login")
	public void compose()
	
	{
		int i=30; int j=20;
		Assert.assertTrue(i>j);
		
		System.out.println("This is compose method");
	}
		
	
	@BeforeClass(enabled=false)
	public void beforeClassyahoo()
	{
		System.out.println("This is yahoo method");
		
//		throw new SkipException("THis TC is skipped");             // This will execute the TC but will mark it as SKIPPED
	}
	
	
	
//	
//	//"enabled=false" OR "throw new SkipException" is used to skip the TC
//	
//	@Test//(enabled=false)  // THis will be skipping the TC itself, and will NOT execute the TC
//	public void yahoo()
//	{
//		int i=20; int j=30;
//		Assert.assertTrue(i>j);
//		System.out.println("This is yahoo method");
//		throw new SkipException("THis TC is skipped");  // This will execute the TC but will mark it as SKIPPED
//	}
//	
//	@BeforeClass
//	public void zahoo()
//	{
//		
//		System.out.println("This is zahoo method");
////		throw new SkipException("THis TC is skipped");  // This will execute the TC but will mark it as SKIPPED
//	}
//
//
//	@Test(dependsOnMethods= {"login"})
//	public void compose()
//	{
//		int i=20; int j=30;
//		Assert.assertTrue(i>j);
//		System.out.println("This is compose method");
//	}
//		
//	
//	@Test
//	public void login()
//	{
//		System.out.println("This is login method");
//	}
//	
	
	
	
}
