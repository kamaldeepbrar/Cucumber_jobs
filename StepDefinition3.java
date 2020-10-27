package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition3 {
	
	WebDriver driver;
    WebDriverWait wait;
    
    
	@Given("^User is on Alchmey jobs home page for posting a job$")
    public void userIsOnAlchemyjobPage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/");
    }
	
	@Then("^Click on post jobs$")
	public void postjob() throws InterruptedException {
    //driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div[3]/div/nav/div/ul/li[1]/a")).click();
        
    //Thread.sleep(30000);
    
    driver.findElement(By.linkText("Post a Job")).click();
        		
	}
	
	@Then("^Enter the \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\", \"(.*)\" details and click on the Preview button$")
	public void fillJobDetails(String email, String jobTitle, String location, String description,
			String applicationEmail, String companyName) {
		
		driver.findElement(By.id("create_account_email")).clear();
		driver.findElement(By.id("create_account_email")).sendKeys(email);

		driver.findElement(By.id("job_title")).clear();
		driver.findElement(By.id("job_title")).sendKeys(jobTitle);

		driver.findElement(By.id("job_location")).clear();
		driver.findElement(By.id("job_location")).sendKeys(location);

		driver.findElement(By.id("job_location")).clear();
		driver.findElement(By.id("job_location")).sendKeys(location);

		WebElement iframe = driver.findElement(By.id("job_description_ifr"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("/html/body")).sendKeys(description);
		driver.switchTo().defaultContent();

		driver.findElement(By.id("application")).clear();
		driver.findElement(By.id("application")).sendKeys(applicationEmail);

		driver.findElement(By.id("company_name")).clear();
		driver.findElement(By.id("company_name")).sendKeys(companyName);

		driver.findElement(By.name("submit_job")).click();
	}

}
