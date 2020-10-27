package stepDefinition;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	    WebDriver driver;
	    WebDriverWait wait;
	    
	    @Given("^User is on Alchmey jobs Login page$")
	    public void userIsOnAlchemyPage() throws Throwable {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	        wait = new WebDriverWait(driver, 15);
	                
	        //Open the browser
	        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	    }
	    
	    @When("^User enters \\\"(.*)\\\" and \\\"(.*)\\\"$")
	    public void userentersUsernameAndHitsENTER(String username, String password) {
	        driver.findElement(By.id("user_login")).sendKeys("root");
	        //Enter password
	        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
	        
		    //Click Login
	        driver.findElement(By.id("wp-submit")).click();
		    	        
	    }
	    
	    @Then("^Locate the left hand menu and click the menu item that says \"Users\"$")
	    public void Locatethelefthandmenu() {
	    	//driver.findElement(By.className("wp-menu-name")).click();
	    	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[11]/a/div[3]")).click();
	    }
	    
	    @And("^Fill in the necessary details$")
	    public void Necessarydetails() {
	    	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/a")).click();
	    	driver.findElement(By.id("user_login")).sendKeys("root1112");
		    driver.findElement(By.id("email")).sendKeys("sdet34@gmail.com");
		    //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[4]/form/table/tbody/tr[6]/td/button")).click();
		    
		    
		    driver.findElement(By.id("createusersub")).click();
		    
	    }
		    
		@And("^Verify the new user$")
		public void Verifyuser() {
			driver.findElement(By.id("user-search-input")).sendKeys("root1112");
			driver.findElement(By.id("search-submit")).click();
			
			
		}
		    


	    @And("^Close the browser$")
	    public void closeTheBrowser() throws Throwable {
	        driver.close();
	    }
	}


