import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Sonam\\\\SeleniumBySonam\\\\SoftwareRequiredForSelenium\\\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
			
		driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Girish");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //1st accept
		Thread.sleep(2000);
		//System.out.println(driver.switchTo().alert().getText());	// Customer Successfully Delete!
		//String check = driver.switchTo().alert().getText();
		
		if (driver.switchTo().alert().getText() == "Customer Successfully Delete!")
		{
			System.out.println("Customer deleted successfully");
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Please contact admin");
			driver.switchTo().alert().accept();
		}
			
		
		
		
		
		
		
	}

}
