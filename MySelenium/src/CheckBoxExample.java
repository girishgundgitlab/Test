import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
//		chkbox.click();  // cntrl + /
		
//		System.out.println(chkbox.isDisplayed());  // true
//		System.out.println(chkbox.isEnabled());  // true
//		System.out.println(chkbox.isSelected());  // true
		
		if(chkbox.isSelected() == false) 
		{ 
			chkbox.click();
			System.out.println("Checkbox is selected in this if statement");
		}
		else 
		{
			System.out.println("Checkbox is already selected");
		}

	}

}
