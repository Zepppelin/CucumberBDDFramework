package stepDefinations;

import java.util.List;

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

public class DealStepDefination 
{
	/*WebDriver driver;
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
		List<List<String>> data=credentials.raw();
		
	    driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
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
		List<List<String>> dealValues=dealData.raw();
		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
		 Thread.sleep(5000);
	}
	   

	@Then("^close the browser$")
	public void close_the_browser() 
	{
	    driver.quit();
	}*/


}