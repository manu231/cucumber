package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//@RunWith(Cucumber.class)
public class Login {
    WebDriver driver;
    
    @Given("^User is already on login page$")
    public void user_is_already_on_login_page() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe"); 
    driver = new FirefoxDriver();
    Thread.sleep(3000);
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    
    
    }

    @When("^Title of login page is facebook$")
    public void title_of_login_page_is_facebook()  {
    	String expectedTitle = driver.getTitle();
    	String actualTitle = "Facebook - Log In or Sign Up";
  
    	System.out.println("Expected title is : " +expectedTitle);
    	if(actualTitle==expectedTitle ) {
    		System.out.println("Successful");
    	}else {
    		System.out.println("Failed");
    	}
        
    }

    @Then("^User enter username and password$")
    public void user_enter_username_and_password() {
        driver.findElement(By.name("email")).sendKeys("chillara.rao@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Bindu");
    }

    @And("^Click on login button$")
    public void click_on_login_button() {
       driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
    }

   /* @And("^User is on home page$")
    public void user_i s_on_home_page()  {
       
    }*/

}
	
	
	

