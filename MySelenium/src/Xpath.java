import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath {

	public static void main(String[] args) {
		

			
			 System.setProperty("webdriver.chrome.driver", "E:\\\\Sonam\\\\SeleniumBySonam\\\\SoftwareRequiredForSelenium\\\\chromedriver_96.exe");
				
			 WebDriver driver=new ChromeDriver();
				
				driver.get("https://paytm.com/");
					
				driver.manage().window().maximize();
					
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
			
				WebDriverWait wait = new WebDriverWait(driver, 20);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='24x7 Help']")));
				
				driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
				List<WebElement> allFrames = driver.findElements(By.xpath("//iframe"));
				System.out.println(allFrames.size());
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//span[@event-category='login']")).click();
				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("1234567890");
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("document.getElementById('input_1').value='12'");
				//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567890");
				driver.findElement(By.xpath("//span[@class='ngscope']")).click();
			}

		}