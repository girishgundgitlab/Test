
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraMultipleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\Sonam\\\\\\\\SeleniumBySonam\\\\\\\\SoftwareRequiredForSelenium\\\\\\\\chromedriver_96.exe");
	
	  WebDriver driver=new ChromeDriver();
		
	  driver.get("https://www.Myntra.com/");	
	  
	  driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Sofa");
	  
	  driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
	  
	  
	    List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	    checkboxes.get(2).click();
	    
	   Thread.sleep(10000);
	   
	   checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	   checkboxes.get(3).click();

	  

	}

}
