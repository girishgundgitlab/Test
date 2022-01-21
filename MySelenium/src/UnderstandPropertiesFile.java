import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandPropertiesFile {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		WebDriver driver = new ChromeDriver();
		
		FileInputStream fip = new FileInputStream("E:\\13Nov21\\MySelenium\\AllxPaths.properties");
		
		Properties prop = new Properties();
		
		prop.load(fip);
		
		driver.get(prop.getProperty("website"));
				
		
		driver.findElement(By.xpath(prop.getProperty("LoginButton"))).click(); // using starts-with() method/function of xpath
		
		driver.findElement(By.xpath(prop.getProperty("emailorusername"))).sendKeys("hgagsdkgd");

	}

}
