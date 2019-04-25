package MakeMyTrip.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {
	
	
	
	public static WebDriver driver;
	 public static Properties prop;
	 FileInputStream file;
	
	
	public DriverScript()
	{
		try
		{
			prop=new Properties();
		
			file = new FileInputStream(".\\MakeMyTrip.configure\\MakeMyTrip.properties");
			
			prop.load(file);
		}
		
		catch(Exception e)
		{
		
		System.out.println("sorry file not found"+e.getMessage());
		
		
		}
		}
	
	public void init()
	{
		String browser = prop.getProperty("Browser");
		
		if ( browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\MakeMyTrip.Browser\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver", ".\\MakeMyTrip.Browser\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}

}
