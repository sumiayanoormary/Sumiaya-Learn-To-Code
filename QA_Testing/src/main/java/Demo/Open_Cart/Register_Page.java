package Demo.Open_Cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
     WebDriver driver;
     
     public Register_Page(WebDriver driver) {
    	 this.driver = driver;
    	 PageFactory.initElements(driver, this);
     }
	@FindBy(id= "input-firstname")   
	WebElement First_Name;
	
	@FindBy(id="input-lastname")
	WebElement Last_Name;
	
	@FindBy(id="input-email")
	WebElement Email;
	
	@FindBy(id="input-telephone")
	WebElement Telephone;
	
	@FindBy(id="input-password")
	WebElement Password;
	
	@FindBy(id="input-confirm")
	WebElement Password_Confirm;
	
	@FindBy(name="agree")
	WebElement Agree;
	
	@FindBy(css="#content > form > div > div > input.btn.btn-primary")
	WebElement Continue;
	
	public void Enter_First_Name(String first_name) {
		First_Name.sendKeys(first_name);
	}

	public void Enter_Last_Name(String last_name) {
		Last_Name.sendKeys(last_name);
	}
	public void Enter_Email(String email) {
		Email.sendKeys(email);
	}
	public void Enter_Telephone(String telephone) {
		Telephone.sendKeys(telephone);
	}
	public void Enter_Password(String password) {
		Password.sendKeys(password);
	}
	public void Enter_Password_Confirm(String password_confirm) {
		Password_Confirm.sendKeys(password_confirm);
	}
	public void Click_Agree() {
		Agree.click();
	}
	public void Click_Continue_Button() {
		Continue.click();
	}	
	
	
	
	
}
