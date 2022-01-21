import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTableDemo {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","E:\\\\\\\\Sonam\\\\\\\\SeleniumBySonam\\\\\\\\SoftwareRequiredForSelenium\\\\\\\\chromedriver_96.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
			
			driver.manage().window().maximize();
			
			List<WebElement> allCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));	//list of all companies
			
			List<WebElement> allCurrentPrices=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));    //list of all current prices 
			
			for(int i=0;i<allCompanies.size();i++)
			{
				System.out.println(allCompanies.get(i).getText());
				System.out.println(allCurrentPrices.get(i).getText());
			
			//if(allCompanies.get(i).getText().equalsIgnoreCase("reliance COM") & allCompanies.get(i).getText().equalsIgnoreCase("iDBI Bank"))
				if(allCompanies.get(i).getText().equalsIgnoreCase("birlaSOFT"))
				{
					System.out.println("Birlasoft current price is " + allCurrentPrices.get(i).getText());
				}
				if(allCompanies.get(i).getText().equalsIgnoreCase("Aarti Ind. Ltd"))
				{
					System.out.println("Aarti Ind. Ltd current price is " + allCurrentPrices.get(i).getText());
			  				break;
			  }
		}
	}
	
}