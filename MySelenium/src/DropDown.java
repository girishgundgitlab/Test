import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&src=search&activity=header-signin&pspid=2114723002&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&specId=yidReg&done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr");
		
		//Store the webelement pointing to the dropdown list
		WebElement month_dropdown = driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
		
		// Select class is used to carry on dropdown selection
		Select s = new Select(month_dropdown); 
		
		System.out.println(s.isMultiple());
		
		s.selectByIndex(8);
		System.out.println("August month selected");
		Thread.sleep(2000);
		s.selectByValue("7");
		System.out.println("July month selected");
		Thread.sleep(2000);
		s.selectByVisibleText("November");
		System.out.println("November month selected");
			
		
		WebElement CountryCode_dropdown = driver.findElement(By.xpath("//select[@name='shortCountryCode']"));
		
		Select s1= new Select(CountryCode_dropdown);
		
		s1.selectByIndex(4);

	}

}
