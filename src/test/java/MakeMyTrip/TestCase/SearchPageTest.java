package MakeMyTrip.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MakeMyTrip.Pages.HomePage;
import MakeMyTrip.Pages.SearchPage;
import MakeMyTrip.TestBase.DriverScript;

public class SearchPageTest extends DriverScript{
	
	
	HomePage HP;
	SearchPage  SP;

	
	public SearchPageTest()
	{
		super();
	}
		
	  @BeforeMethod
		public void Setpu() 
		{
			init();
			
			 HP = new HomePage();
			SP= new SearchPage();
			
			
		}
	  
	
	 //@Test(priority=1)
	  public void SearchPageTest() throws Exception
	  {
		  
		    HP.ClickOnRoundTrip();
			HP.VerifyFromCity();
			Thread.sleep(1000);
			HP.VerifyToCity();
			Thread.sleep(1000);
			HP.ClickOnDeparture();
			HP.ClickOnReturn();
			HP.SearchButton();
		    
		  
		 
	  }
	 // @Test(priority=2)
	  public void SearchPageElementListTest() throws Exception
	  {
		  HP.ClickOnRoundTrip();
			HP.VerifyFromCity();
			Thread.sleep(1000);
			HP.VerifyToCity();
			Thread.sleep(1000);
			HP.ClickOnDeparture();
			HP.ClickOnReturn();
			HP.SearchButton();
			SP.ClickDepartureFlight();
		    SP.DepartureList1();
		    SP.DepartureListLeft();
		    //SP.DepartureListRight();
		  
	  }
	  
	 // @Test(priority=3)
	  public void verifyNonStopTest() throws Exception
	  {
		    HP.ClickOnRoundTrip();
			HP.VerifyFromCity();
			Thread.sleep(1000);
			HP.VerifyToCity();
			Thread.sleep(1000);
			HP.ClickOnDeparture();
			HP.ClickOnReturn();
			HP.SearchButton();
			SP.ClickNonStopt();
			SP.ClickRadioButton();
			SP.verifyINRAmount();
	  }
	  @Test(priority=4)
	  public void AssertValues() throws InterruptedException
	  {
		  HP.ClickOnRoundTrip();
			HP.VerifyFromCity();
			Thread.sleep(1000);
			HP.VerifyToCity();
			Thread.sleep(1000);
			HP.ClickOnDeparture();
			HP.ClickOnReturn();
			HP.SearchButton();
			SP.ClickRadioButton3();
			SP.ClickINR3();
			SP.ClickCompareINR3();
			SP.VerifyAmount();
	  }
	  
	  
		@AfterMethod
		public void teatdown()
		{
		driver.close();
		}
		
	
}
