package Demo.Open_Cart.Noor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page_Noor {
	WebDriver driver;
	
public Login_Page_Noor(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, this);
}
	@FindBy(id="input-email")
	WebElement Email;
		
	@FindBy(id="input-password")
	WebElement Password;
	
	@FindBy(css="#content > div > div:nth-child(2) > div > form > input")
	WebElement Login;
	
	@FindBy(css = "#top-links > ul > li.dropdown > a > i")
	 WebElement DropDown;
	 
	@FindBy(css = "#top-links > ul > li.dropdown.open > ul > li:nth-child(5) > a")
	WebElement LogOutButton;

	
	public void Enter_Email(String email) {
		Email.sendKeys(email);
	}
	
	public void Enter_Password(String password) {
	Password.sendKeys(password);
	}
	
	public void Click_Login_Button() {
		Login.click();
	}
	
	 public void Log_Out() {
			DropDown.click();
			LogOutButton.click();
		}
	 
}
