package Demo.Open_Cart.Noor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_Noor {
 
	WebDriver driver;
	
	public Home_Page_Noor(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a")
	WebElement My_Account_LinkBy;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement Register_LinkBy;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement Login_LinkBy;
	
	
	public void Register() {
		My_Account_LinkBy.click();
		Register_LinkBy.click();
	}
		
	public void Login() {
		My_Account_LinkBy.click();
		Login_LinkBy.click();
		
	}
	
}	
	

