package MakeMyTrip.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MakeMyTrip.Pages.HomePage;
import MakeMyTrip.TestBase.DriverScript;

public class HomePageTest extends DriverScript{
	
	HomePage HP;
	
	
	
	public HomePageTest()
	{
		super();
	}
		
	  @BeforeMethod
		public void Setpu() 
		{
			init();
			
			 HP = new HomePage();
			
		}
		
		
		@Test(priority=1)
		public void MakeMyTripHomePageTitleTest()
		{
			 HP.GetTitle();
			
			//Assert.assertEquals(Title, "Flight Booking, Flight Tickets Booking at Lowest Airfare | MakeMyTrip");
		
		   
		}
		@Test(priority=2)
		public void MakeMyTripHomePageElementTest() throws Exception
		{
			//HP.ClickOnFlight();
			HP.ClickOnRoundTrip();
			HP.VerifyFromCity();
			Thread.sleep(1000);
			HP.VerifyToCity();
			Thread.sleep(1000);
			HP.ClickOnDeparture();
			HP.ClickOnReturn();
			HP.SearchButton();
		}
		
			
		
		
		@AfterMethod
		public void teatdown()
		{
		driver.close();
		}
		
		
	
	

}
