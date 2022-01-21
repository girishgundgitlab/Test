import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=search&specId=yidreg&activity=header-signin&pspid=2114723002&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&intl=in&prompt=login");
		
		driver.findElement(By.id("login-username")).sendKeys("girishgund"); // Webelement and its location within the webpage
		
//		driver.findElement(By.name("username")).sendKeys("girishgund");
		
		driver.findElement(By.id("login-signin")).click();  // next button
		
		

	}

}
