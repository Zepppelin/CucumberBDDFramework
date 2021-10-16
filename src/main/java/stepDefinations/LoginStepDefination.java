package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination 
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

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username,String password)  
	{
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
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
	@Then("^user moves to new contacts page$")
	public void user_moves_to_new_contacts_page()  throws InterruptedException 
	{
	    driver.switchTo().frame("mainpanel");
	    Thread.sleep(2000);
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	    
	}
	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String position) throws InterruptedException 
	{
		 driver.findElement(By.name("first_name")).sendKeys(firstname);
		 driver.findElement(By.name("surname")).sendKeys(lastname);
		 driver.findElement(By.id("company_position")).sendKeys(position); 
		 Thread.sleep(5000);
	}
	   

	@Then("^close the browser$")
	public void close_the_browser() 
	{
	    driver.quit();
	}*/


}
