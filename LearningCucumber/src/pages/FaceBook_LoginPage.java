package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class FaceBook_LoginPage {
		WebDriver driver;
   
   public FaceBook_LoginPage (WebDriver driver) {
	   this.driver= driver;
	   PageFactory.initElements(driver, this);
   		}
   
   @FindBy(id="email")
   WebElement Username;	
   
   @FindBy(id="pass")
   WebElement Password;	
 
   @FindBy(id="loginbutton")
   WebElement Login_Button;	
   
   
   
   public void Enter_Username(String email) {
		 Username.sendKeys(email);
	 }
   public void Enter_Password(String password) {
		 Password.sendKeys(password);
	 }
   public void Click_Login_Button() {
		  Login_Button.click();
	  }
   
 }
