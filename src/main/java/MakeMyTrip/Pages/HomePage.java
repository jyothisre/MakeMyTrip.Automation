package MakeMyTrip.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import MakeMyTrip.TestBase.DriverScript;

public class HomePage extends DriverScript {
	
	//WebElement Defining
	
	@FindBy(xpath="//span[contains(text(),'Flights')]")
	public WebElement Flight;
	
	
	@FindBy(xpath="//li[contains(text(),'Round Trip')]")
	public  WebElement RoundTrip;
	
	
	@FindBy(xpath="//input[@id='fromCity']")
	public WebElement FromCity;
	
	@FindBy(xpath="//input[@id='toCity']")
	public WebElement ToCity;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/label")
	public WebElement Departure;
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[4]/label/span")
	public WebElement Return;
	
	
	@FindBy(xpath="//*[@id='root']/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[4]/div/p")
	public WebElement TodayDate;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[2]/div/p")
	public WebElement ReturnDate;
	
	@FindBy(xpath="//a[contains(text(),'Search')]")
	public WebElement SearchButton;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String GetTitle()
	{
		String Title=driver.getTitle();
		
		System.out.println("Print The Title Of The HomePage::==>"+Title);
		return Title;
		
	}
	
	//public void ClickOnFlight()
	//{
		// Flight.click();
	//}
	
	
	public void ClickOnRoundTrip()
	{
		RoundTrip.click();
	}
	 
	public void VerifyFromCity()
	 {
		  Actions action = new Actions(driver);
		  action.moveToElement(FromCity).build().perform();
		  //FromCity.clear();
		  FromCity.sendKeys("Delhi, India");
	 }
	
	 public void VerifyToCity()
	 {   
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.elementToBeClickable(ToCity));
		 Actions action1 = new Actions(driver);
		 
		 action1.moveToElement(ToCity).build().perform();
		 //ToCity.clear();
		 ToCity.sendKeys("Bangalore, India");
	 }
	 public void ClickOnDeparture()
		{
		 WebDriverWait wait=new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.elementToBeClickable(Departure));
		 Departure.click();
		 // Departure.sendKeys("22");
		  
		 TodayDate.click();
		 
		}
	 
	 public void ClickOnReturn()
		{
		  Return.click();
		 ReturnDate.click();
		 
		
		}
	 public void SearchButton()
	 {
		 SearchButton.click();
	 }
	
	
	

}
