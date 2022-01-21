package TestNGPgms;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {  
	
	//Verification of the program
	//Login to gmail -- verify whether you have successfully logged in or not
	
	@Test
	public void compareValues()
	{
		int i=10, j=20;
		
//		Assert.assertTrue(i>j);
		Assert.assertTrue("i is not greaterrr",i>j);
		System.out.println("Continue");
		
		
		
//		if(i>j)
//		{
//			System.out.println("i is greater");
//		}
//		else
//		
//			{
//				System.out.println("j is greater");
//			}
		
	}
	
	@Test
	public void compareTitles()
	{
		String ExpectedTitle = "Girish";
		String ActualTitle = "Gireesh";
		
		
		
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	
}
