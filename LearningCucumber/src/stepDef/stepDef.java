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
	    driver.get("https://www.facebook.com/");
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
	
	@When("^User enters First name$")
	public void user_enters_First_name() throws Throwable {
		login.Enter_First_Name("Sumiaya");
	}

	@When("^User enters Last name$")
	public void user_enters_Last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.Enter_Last_Name("Mary");
	}

	@When("^User enters Mobile number or email$")
	public void user_enters_Mobile_number_or_email() throws Throwable {
	    login.Enter_Mobile_Number("4047179547");
	}
	
	@When("^User enters Password$")
	public void user_enters_Password() throws Throwable {
	    login.Enter_New_Password("abcd12345");
	}

	@When("^User enters Birthday$")
	public void user_enters_Birthday() throws Throwable {
	    login.Enter_Birthday_Month("Mar");
	    login.Enter_Birthday_Day("1");
	    login.Enter_Birthday_Year("1993");
	}

	@When("^User enters Gender$")
	public void user_enters_Gender() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.Select_Gender("1");
	}

	@When("^User clicks Sign Up button$")
	public void user_clicks_Sign_Up_button() throws Throwable {
	    login.Click_Sign_Up_Button();
	}

	@Then("^User should be able to Sign Up$")
	public void user_should_be_able_to_Sign_Up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am able to sign-up");
	}
	
}
