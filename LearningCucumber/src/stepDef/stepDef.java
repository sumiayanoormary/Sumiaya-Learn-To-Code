package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FaceBook_LoginPage;

public class stepDef {
	
	WebDriver driver =  new ChromeDriver();
	FaceBook_LoginPage login = new FaceBook_LoginPage(driver);
	
	@Given("^User in Login Page$")
	public void user_in_Login_Page() throws Throwable {
	    driver.get("https://www.facebook.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^User enters username$")
	public void user_enters_username() throws Throwable {
		
		login.Enter_Username("sumiayanoormary@gmail.com");
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User enters password$")
	public void user_enters_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.Enter_Password("Sumi@ya123");
	}

	@When("^User clicks login button$")
	public void user_clicks_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   login.Click_Login_Button();
	}

	@Then("^User should be able to login in$")
	public void user_should_be_able_to_login_in() throws Throwable {
		System.out.println("I am in the Login Page");
	}
}
