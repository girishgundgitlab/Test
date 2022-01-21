import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupWIndows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\Sonam\\\\SeleniumBySonam\\\\SoftwareRequiredForSelenium\\\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
			
		driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
		Set<String> allWindows  = driver.getWindowHandles(); //How will handle he pop up windows.
		
		Iterator<String> itr = allWindows.iterator();
		
		String mainWindow = itr.next();
		String popup1 = itr.next();
		String popup2 = itr.next();
		String popup3 = itr.next();
		
		System.out.println(mainWindow);
		System.out.println(popup1);
		System.out.println(popup2);
		System.out.println(popup3);
		
		driver.switchTo().window(popup1);
		System.out.println(driver.getTitle());
//		driver.close();
		
		driver.switchTo().window(popup2);
		System.out.println(driver.getTitle());
//		driver.close();
		
		driver.switchTo().window(popup3);
		System.out.println(driver.getTitle());
//		driver.close();
		
		driver.quit();
	}

}
