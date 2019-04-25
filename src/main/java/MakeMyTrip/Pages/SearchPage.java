package MakeMyTrip.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import MakeMyTrip.TestBase.DriverScript;

public class SearchPage extends DriverScript{
	
	
	
	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[1]/label")
	public WebElement DepartureList;
	
	@FindBy(xpath="//*[@id='ow_domrt-jrny']")
	public WebElement DepartureList1;
     
	@FindBy(xpath="//*[@id='rt-domrt-jrny']/div[1]/div[1]/p[1]")
	public WebElement ReturnList1;
	
	@FindBy(xpath="//p[contains(text(),'Departure Flight')]")
	public WebElement DepartureFlight;
	
	
	@FindBy(xpath="//*[@id='fli_filter__stops']/span[1]/label/span[2]")
	public WebElement NonStop;
	

	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[1]/label/div[2]/div[3]/p/span")
	public WebElement INR;
	
	@FindBy(xpath="//*[@id='left-side--wrapper']/div[2]/div/div[3]/div/div[1]/div[1]/div[1]/div/div[2]/div[4]/p/span")
	public WebElement INR1;
	
	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[3]/label/div[1]/span[1]/span")
	public WebElement RadioButton;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[3]/label/div[1]/span[1]/span")
	public WebElement RadioButton3;
	
	
	@FindBy(xpath="//*[@id='ow_domrt-jrny']/div[2]/div[3]/label/div[2]/div[3]/p/span")
	public WebElement INR3;
	
	@FindBy(xpath="//*[@id='left-side--wrapper']/div[2]/div/div[3]/div/div[1]/div[1]/div[1]/div/div[2]/div[4]/p/span")
	public WebElement CompareINR3;

	
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void DepartureList1()
	{
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ow_domrt-jrny']/div[2]/div[1]/label"));
		
		for (WebElement webElementcount : list)
		{
			
			String text = webElementcount.getText();
			
			System.out.println("List the Elements::"+text);
			
			
		}}
		
		public void DepartureListLeft()
		{
			
			List<WebElement> table = driver.findElements(By.tagName("div"));
			for (WebElement webElements : table) 
			{
				
				System.out.println(webElements.getText());
				
				
				
				
			}
			
		}
		
		
		public void ClickDepartureFlight()
		{
			DepartureFlight.click();
		}
		
		public void ClickNonStopt()
		{
			NonStop.click();
		}
		
		
		public void verifyINRAmount()
		{
			
	     if(INR.getText().equals(INR1.getText()))
	     {
		   System.out.println("Print the Amount is Equal"+INR.getText());
		 
	     }
	     else 
	     {
	    	 System.out.println("Print the Amount is NOTEqual"+INR);
	    	 
	    }

	
	
		}
		public void ClickRadioButton()
		{
			RadioButton.click();
		}

		public void ClickRadioButton3()
		{
			 //driver.getEval("scrollBy(0, 250)");
			 WebDriverWait wait=new WebDriverWait(driver, 10);
			 
	        wait.until(ExpectedConditions.elementToBeClickable(RadioButton3)).click();;
			
		}
          
		public void ClickINR3()
		{
			INR3.getText();
			System.out.println("Print the value of given INR Amount::==>"+INR3);
		}
		
		public void ClickCompareINR3()
		{
			CompareINR3.getText();
			System.out.println("Print the value of given INR Amount::==>"+CompareINR3);
		}
		public WebElement VerifyAmount()
		{
			WebElement Flag = INR3;
			WebElement	Flag1=CompareINR3;
			Assert.assertEquals(INR3, CompareINR3,"Equal");
				return Flag;
		}
}

