import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffMoneyPortfolio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.target.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Samsung Tv");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait Wait=new WebDriverWait(driver,20);
		
		Thread.sleep(10000);

//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='mainContainer']/div[4]/div[2]/div/div[1]/div[3]/div[2]/ul/li[1]/div/div[1]/h3/div/a/div[2]/div/div/picture/img"))).click();
		
		
	//	driver.findElement(By.xpath("//a[@class='Link_StyledLink-sc-4b9qcv-0 styles_StyledTitleLink-sc-h3r0um-1 iBIqkb eQFZgH h-display-block h-text-bold h-text-bs']")).click();
	
}


//img//div[@class='Col-sc-favj32-0 cbNlXt _web-inspector-hide-shortcut_']
//div[@class='media__ScalableImage-sc-1ea3f06-0 jDKgFl']

		

	}


