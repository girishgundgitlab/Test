import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyBoardSimulation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\\\\\\\Sonam\\\\\\\\SeleniumBySonam\\\\\\\\SoftwareRequiredForSelenium\\\\\\\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement FashionHover = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(FashionHover).build().perform();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung TV");
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		act.contextClick(electronics).build().perform();
		
		
		
		
		
	}

}
