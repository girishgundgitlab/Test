

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriWebsitePopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\\\\\Sonam\\\\\\\\SeleniumBySonam\\\\\\\\SoftwareRequiredForSelenium\\\\\\\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		Iterator<String> itr =allWindows.iterator();
		
		String mainWindow=itr.next();
		
		System.out.println(mainWindow);
		
		String popup1=itr.next();
		String popup2=itr.next();
		
		//switch to 1st popup, fetch the title & close it
		driver.switchTo().window(popup1);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(popup2);
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.quit();//will close all the window
		
		

	}

}
