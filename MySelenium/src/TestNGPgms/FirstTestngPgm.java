package TestNGPgms;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FirstTestngPgm {
		
	
	
	//@Test tag/annotation is used for running the TC within TestNG
	@Test
	public void b()
	{
		int i=20; int j=30;
		Assert.assertTrue(i>j);
		System.out.println("This is b method");
	}
	
	@Test
	public void a()
	{
		System.out.println("This is a method");
	}
		
	@Test
	public void c()
	{
		System.out.println("This is c method");
	}
	
	
	public void d()
	{
		System.out.println("This is d method");
	}
	
	
	
	
}
