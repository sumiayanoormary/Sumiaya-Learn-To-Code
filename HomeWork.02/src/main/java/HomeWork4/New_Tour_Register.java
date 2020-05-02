package HomeWork4;
	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class New_Tour_Register { 
	WebDriver driver;
	
	public New_Tour_Register(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
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
	WebElement Postal_Code;
	
	@FindBy(name="country")
	WebElement Country;
	
	@FindBy(id="email")
	WebElement User_Name;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmPassword")
	WebElement Confirm_Password;
	
	@FindBy(name="register")
	WebElement Click_Submit_Button;
	
	@FindBy(tagName="title")
	WebElement Title;			
}

