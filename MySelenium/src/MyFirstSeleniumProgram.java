import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumProgram {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.chrome.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\chromedriver_96.exe"); // absolute path
//		System.setProperty("webdriver.ie.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\iedriver.exe"); // absolute path
		System.setProperty("webdriver.gecko.driver", "E:\\Sonam\\SeleniumBySonam\\SoftwareRequiredForSelenium\\geckodriver.exe"); // absolute path
		
//		WebDriver driver = new ChromeDriver(); // to import all the remaining imports-- > cntrl + shift + O
//		WebDriver driver = new InternetExplorerDriver(); 
		WebDriver driver = new FirefoxDriver(); 

		driver.get("https://login.yahoo.com/account/create?.intl=in&.lang=en-IN&src=search&activity=header-signin&pspid=2114723002&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&specId=yidReg&done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr");
		
		driver.manage().window().maximize();
		
//		driver.close();
		
		
		
	}

}
