package Php.Travels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;
	
	public Register(WebDriver driver) {
		   this.driver= driver;
		   PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	WebElement First_Name;
	
	@FindBy(name="lastname")
	WebElement Last_Name;
	
	@FindBy(name="phone")
	WebElement Mobile_Number;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password ;
	
	@FindBy(name="confirmpassword")
	WebElement Confirm_Password;
	
	@FindBy(css="#headersignupform > div:nth-child(8) > button")
	WebElement Button_Text;
	
	 public void Enter_First_Name(String first_name ) {
		   First_Name.sendKeys(first_name);
	   }
	 public void Enter_Last_Name(String last_name ) {
		  Last_Name.sendKeys(last_name);
	   }
	 public void Enter_Mobile_Number(String phone) {
		  Mobile_Number.sendKeys(phone);
	   }
	 public void Enter_Email(String email ) {
		  Email.sendKeys(email);
	   }
	 public void Enter_Password(String password ) {
		  Password.sendKeys(password);
	   }
	 public void Enter_Confirm_Password(String confirmpassword ) {
		  Confirm_Password.sendKeys(confirmpassword);
	   }
	 public String Read_Submit_Button() {
		   String title = Button_Text.getText();
		   return title;
	 }
	   
	   
	   
	   
	   
	
	
	
	
	
	

}
