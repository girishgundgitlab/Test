import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumWithConstructor {
	
	WebDriver driver;

	@Test
	public void m2() throws InterruptedException{ //main
		
//		SeleniumWithConstructor sc =  new SeleniumWithConstructor();
		login();
		
		SeleniumWithConstructor sc1 =  new SeleniumWithConstructor();
		sc1.compose();
	}

	public void login() throws InterruptedException
	{
		System.out.println("THis is 1st test case which logins to website");
		driver.findElement(By.id("login-username")).sendKeys("girishgund"); // Webelement and its location within the webpage
		
		Thread.sleep(2000);
		driver.findElement(By.id("login-signin")).click();  // next button
		Thread.sleep(5000);
		driver.close();
	}
	
	public void compose() throws InterruptedException 
	{
		System.out.println("THis is 2nd test case which composed email");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='help']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
	
	public void m1()
	{
		System.out.println("This is m1 method");
	}
	
	public SeleniumWithConstructor()  //This is constructor
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=search&specId=yidreg&activity=header-signin&pspid=2114723002&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&intl=in&prompt=login");
	}
	
	
}
