import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingPrecedingXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mypage.rediff.com/login/dologin");
		
//		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("Girish");
		
		driver.findElement(By.xpath("//input[@id='pass_box']/preceding::input")).sendKeys("Girish");
		
		driver.findElement(By.xpath("//input[@name='id']/following::input[1]")).sendKeys("Password");
		

	}

}

