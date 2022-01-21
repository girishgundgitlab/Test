

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMultipleCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\\\Sonam\\\\SeleniumBySonam\\\\SoftwareRequiredForSelenium\\\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.amazon.in/");
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Mobile");
	
    WebElement searchButton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
    searchButton.click();
    
    List<WebElement> checkboxes=driver.findElements(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
    checkboxes.get(2).click();
    
    	Thread.sleep(5000);
   
    	checkboxes=driver.findElements(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
   checkboxes.get(3).click();
 
 
   
	}

}
