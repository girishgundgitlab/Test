

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetMultipleCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Sonam\\\\SeleniumBySonam\\\\SoftwareRequiredForSelenium\\\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.target.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("watch");
	
        WebElement searchButton=driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();    
	    
	   
	    List<WebElement> checkboxes=driver.findElements(By.xpath("//div[@class='styles__StyledRow-sc-1nuqtm0-0 cuJjmE styles__CheckboxWrapperRow-sc-1vhsjwn-1 juJjEw']"));
	    System.out.println(checkboxes.size());
	    checkboxes.get(1).click();
	    checkboxes.get(1).click();
	    checkboxes.get(1).click();
	    
//	    driver.navigate().refresh();
	    Thread.sleep(5000);
	    
	    checkboxes=driver.findElements(By.xpath("//div[@class='styles__StyledRow-sc-1nuqtm0-0 cuJjmE styles__CheckboxWrapperRow-sc-1vhsjwn-1 juJjEw']"));
	    System.out.println(checkboxes.size());
	    checkboxes.get(2).click();

	    
    

	}

}
