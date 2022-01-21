
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentRediffArray {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Sonam\\\\SeleniumBySonam\\\\SoftwareRequiredForSelenium\\\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.rediff.com/");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//div[@class='tabs active']")).click();
	
	List<WebElement> Arr=driver.findElements(By.xpath("//h2[@class='news']"));
	
	//System.out.println(Arr.get(0).getText());
	
	
//	Arr.get(3).click();
	
	//System.out.println(Arr.get(1).getText());
	//System.out.println(Arr.get(3).getText());
	
	
//	for(int i=0;i<Arr.size();i++)
//	{
//		System.out.println(Arr.get(i).getText());
//	}
	
	
	for(int j=0;j<Arr.size();j++)
	{
		//Arr at this line
		Arr.get(j).click();
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Arr at this line is invalid
		Arr=driver.findElements(By.xpath("//h2[@class='news']"));
		//Arr at this line
	}
	
                                                                                                                                                                                                                                                              
	}
}
	





