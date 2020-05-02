package New.Tour;

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
	
	@FindBy(tagName="title")
	WebElement Title;
	
	@FindBy(name="firstName")
	WebElement First_Name;
	
	@FindBy(name="lastName")
	WebElement Last_Name;
	
	@FindBy(name="phone")
	WebElement Phone;
	
	@FindBy(id="userName")
	WebElement Email;
	
	@FindBy(name="address1")
	WebElement Address;
	
	@FindBy(name="city")
	WebElement City;
	
	@FindBy(name="state")
	WebElement State;
	
	@FindBy(name="postalCode")
	WebElement ZipCode;
	
	@FindBy(name="country")
	WebElement Country;

	@FindBy(id="email")
	WebElement User_Name;

	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmPassword")
	WebElement Confirm_Password;
	
	@FindBy(name="register")
	WebElement Submit_Button;
	
	  public String Get_Title() {
		 return Title.getText();
	  }
	
	   public void Enter_First_Name(String first_name ) {
		   First_Name.sendKeys(first_name);
	   }
	   
	   public void Enter_Last_Name(String last_name ) {
		  Last_Name.sendKeys(last_name);
	   }
	   
	   public void Enter_Phone(String phone ) {
		   Phone.sendKeys(phone);
	   }
	   
	   public void Enter_Email(String email ) {
		   Email.sendKeys(email);
	   }
	   
	   public void Enter_Address(String address1 ) {
		   Address.sendKeys(address1);
	   }
	   public void Enter_City(String city ) {
		   City.sendKeys(city);
	   }
	   public void Enter_State(String state ) {
		   State.sendKeys(state);
	   }
	   public void Enter_ZipCode(String postalCode ) {
		   ZipCode.sendKeys(postalCode);
	   }
	   public void Enter_Country(String country ) {
		   Country.sendKeys(country);
	   }
	   public void Enter_User_Name(String email ) {
		   User_Name.sendKeys(email);
	   }
	   public void Enter_Password(String password ) {
		   Password.sendKeys(password);
	   }
	   public void Enter_Confirm_Password(String confirmPassword ) {
		   Confirm_Password.sendKeys(confirmPassword);
	   }
	   public void Enter_Submit_Button() {
		   Submit_Button.click();
	   }
	
	
}
