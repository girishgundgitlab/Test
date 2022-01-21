import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			
		driver.manage().window().maximize();
		
		driver.switchTo().frame(1);
		
		WebElement animals= driver.findElement(By.xpath("//select[@class='col-lg-3']"));
		
		Select s = new Select(animals);
		
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByIndex(1);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("ABCD");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		Thread.sleep(4000);
		
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByIndex(1);
		
		
		
		

		

	}

}
