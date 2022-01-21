import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.com");
		
//		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();  //basic xpath
//		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();  // using text() method/function of xpath
//		driver.findElement(By.xpath("//span[contains(@id,'link-accountList')]")).click(); // using contains() method/function of xpath
		driver.findElement(By.xpath("//span[starts-with(@id,'nav-link')]")).click(); // using starts-with() method/function of xpath
		
		
		
	}

}
