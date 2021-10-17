package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class taggedHooksStepDefinations 
{
    //global hooks
	@Before
	   public void serUp() {
		   System.out.println("Launch FF");
		   System.out.println("Enter url for free crm");
	   }
	 @After
	   public void tearDown() 
	   {
		   System.out.println("close the browser");
	   }
	 
	 //local hooks
	 @Before("@First")
	 public void beforeFirst() 
	 {
		 System.out.println("Before only first scenario");
	 }
	 @After("@First")
	 public void afterFirst()
	 {
		 System.out.println("After only first scenario");
	 }
	 @Before("@Second")
	 public void beforeSecond() 
	 {
		 System.out.println("Before only second scenario");
	 }
	 @After("@Second")
	 public void afterSecond()
	 {
		 System.out.println("After only second scenario");
	 }
	 @Before("@Third")
	 public void beforeThird() 
	 {
		 System.out.println("Before only third scenario");
	 }
	 @After("@Third")
	 public void afterThird()
	 {
		 System.out.println("After only third scenario");
	 }
	
	@Given("^This the first step$")
	public void this_the_first_step() 
	{
	    System.out.println("1st step");
	}

	@When("^This is the second step$")
	public void this_is_the_second_step()  {
	   System.out.println("2nd step");
	}

	@Then("^This is the thirt step$")
	public void this_is_the_thirt_step()  {
	    System.out.println("3rd step");
	}


}
