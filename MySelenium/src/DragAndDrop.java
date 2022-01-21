import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\\\\\\\Sonam\\\\\\\\SeleniumBySonam\\\\\\\\SoftwareRequiredForSelenium\\\\\\\\chromedriver_96.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Number of frames are " + frames.size());  // 10
		
		driver.switchTo().frame(0);
				
		//Source element
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//Destination element
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions acti = new Actions(driver);
		
		acti.dragAndDrop(source, destination).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Menu']")).click();

	}

}
