package stepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepsWithMapDefinations 
{

	WebDriver driver;
	@Given("^User is already on login page$")
	public void user_is_already_on_login_page()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\z00467ka\\Desktop\\Selenium files\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
		driver = new FirefoxDriver();
		driver.get("https://classic.crmpro.com/index.html");
	}

	@When("^Title of login page is Free Crm$")
	public void title_of_login_page_is_Free_Crm() 
	{
	   String title= driver.getTitle();
	   System.out.println(title);
	   Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials)  
	{
		for(Map<String,String> data:credentials.asMaps(String.class, String.class))
		{
			 driver.findElement(By.name("username")).sendKeys(data.get("username"));
			 driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException 
	{
	    WebElement wb=driver.findElement(By.xpath("//input[@class='btn btn-small']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", wb);
	    Thread.sleep(5000);
	}

	@Then("^user on home page$")
	public void user_on_home_page() 
	{
		String title1= driver.getTitle();
		   System.out.println(title1);
		   Assert.assertEquals("CRMPRO", title1);
	}
	@Then("^user moves to new deals page$")
	public void user_moves_to_new_deals_page()  throws InterruptedException 
	{
	    driver.switchTo().frame("mainpanel");
	    Thread.sleep(2000);
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	    
	}
	@Then("^user enters deals details$")
	public void user_enters_deals_details(DataTable dealData) throws InterruptedException 
	{
		for(Map<String,String> data:dealData.asMaps(String.class, String.class))
		{
			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			 driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
			 driver.findElement(By.id("probability")).sendKeys(data.get("probablity"));
			 driver.findElement(By.id("commission")).sendKeys(data.get("commision"));
			 driver.findElement(By.xpath("//td[@colspan='2']//input[@type='submit' and @value='Save' and @class='button']")).click();
			 Thread.sleep(1000);
			 Actions act = new Actions(driver);
			 act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
			 
		}
		 
	}
	   

	@Then("^close the browser$")
	public void close_the_browser() 
	{
	    driver.quit();
	}


}