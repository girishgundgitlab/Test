import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffDropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@style='width:58px; height: 20px; float:left; cursor: pointer; border:1px solid #C0C0C0; font-size:14px;']")).click();
		
		List<WebElement> mobile_code_dropdown = driver.findElements(By.xpath("//div[@id='country_id']/ul/li"));
		
		mobile_code_dropdown.get(4).click();
		
		

	}

}
