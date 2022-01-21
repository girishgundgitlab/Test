import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLoginExplicitWait {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "E:\\\\Sonam\\\\SeleniumBySonam\\\\SoftwareRequiredForSelenium\\\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		
	driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mamathareddybommineni@yahoo.com");
	
	driver.findElement(By.xpath("//input[@name='signin']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']"))).sendKeys("Chintu123");
	
	driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
	
	driver.findElement(By.xpath("//a[@role='button']")).click();
	
	WebDriverWait Wait=new WebDriverWait(driver,20);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='typeahead-inputs-container p_R']"))).sendKeys("mamathab1563@gmail.com");
	
	//driver.findElement(By.xpath("//div[@class='typeahead-inputs-container p_R']")).sendKeys("mamathab1563@gmail.com");
	
	
	
	
	}
	

}