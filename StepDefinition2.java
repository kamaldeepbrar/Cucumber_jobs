package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;


public class StepDefinition2 {
	
	WebDriver driver;
    WebDriverWait wait;
    
    
	@Given("^User is on Alchmey jobs home page$")
    public void userIsOnAlchemyPage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }
	
	@Then("^Find the keywords search input field$")
    public void userenterskeyword() throws InterruptedException {
		
        driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        
        Thread.sleep(30000);
        
        driver.findElement(By.id("job_type_freelance")).click();
		driver.findElement(By.id("job_type_internship")).click();
		driver.findElement(By.id("job_type_part-time")).click();
		driver.findElement(By.id("job_type_temporary")).click();
	    	        
    }
	
	@Then("^Find the job details$")
	public void jobdetails() throws InterruptedException
	
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/ul/li[2]/a/div[1]/h3")).click();
		}
	
	@And("^Find the title of the job$")
	public void jobtitle() {
		String getJobTitle = driver.findElement(By.className("entry-title")).getText();

		Assert.assertEquals(getJobTitle, "Automation Tester 01");
	}
	
	@Then("^Apply for the job$")
	public void applyjob() {
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/div/div/div[3]/input")).click();
	}
	
	
	
}
	
		
	


