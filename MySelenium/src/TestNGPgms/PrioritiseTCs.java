package TestNGPgms;

import org.testng.annotations.Test;

public class PrioritiseTCs {
	
	
	//priority method is used for prioritising the TCs within TestNG
	@Test(priority=3)
	public void Login()
	{
		System.out.println("This is Login method");
	}
	
	@Test(priority=9)
	public void compose()
	{
		System.out.println("This is compose method");
	}
	
	
	@Test(priority=-3)
	public void yahoo()
	{
		System.out.println("This is yahoo method");
	}
	
}
