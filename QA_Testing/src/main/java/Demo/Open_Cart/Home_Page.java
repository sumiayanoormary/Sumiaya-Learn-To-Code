package Demo.Open_Cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
 
	WebDriver driver;
	
	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="My Account")
	WebElement My_Account_Link;
	
	@FindBy(linkText="Continue")
	WebElement Register_Link;
	
	
	public void Register() {
		My_Account_Link.click();
		Register_Link.click();
	}
	
	public void Login() {
		My_Account_Link.click();
	}
	
}
