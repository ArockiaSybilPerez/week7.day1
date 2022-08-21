package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends ProjectSpecificMethods {

	@Given("Launch the chrome browser")
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
			
    }

	@And("Load the Url and Maximize the window")
	public void loadAndMaximize() {
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

    }
	
	@Given("Enter the username as {string}")
	public void typeUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username); 
    }
	
	@And("Enter the Password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
    }

	@When("Click the Login Button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	@Then("Verify the Home is displayed")
	public void verifyHomePage() {
         String text = driver.findElement(By.tagName("h2")).getText();
         System.out.println(text);
         if(text.contains("Welcome")) {
        		System.out.println("The home page is displayed");
 		}else {
 			System.err.println("The home page is not displayed");

         }
	}
	
	@But("Error message is displayed")
	public void verifyErrorMessage() {
      String text = driver.findElement(By.id("errorDiv")).getText();
      System.out.println(text);
	}
	
}