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
   
   @FindBy(name="firstname")
   WebElement First_Name;
   
   @FindBy(name="lastname")
   WebElement Last_Name;
   
   @FindBy(name="reg_email_")
   WebElement Mobile_Number;
   
   @FindBy(name="reg_passwd_")
   WebElement New_Password;
   
   @FindBy(id="month")
   WebElement Birthday_Month;
   
   @FindBy(id="day")
   WebElement Birthday_Day;
   
   @FindBy(id="year")
   WebElement Birthday_Year;
   
   @FindBy(name="sex")
   WebElement Gender;
   
   @FindBy(name="websubmit")
   WebElement Sign_Up_Button;
   
   
   public void Enter_Username(String email) {
		 Username.sendKeys(email);
	 }
   public void Enter_Password(String password) {
		 Password.sendKeys(password);
	 }
   public void Click_Login_Button() {
		  Login_Button.click();
	  }
   public void Enter_First_Name(String firstname) {
	   First_Name.sendKeys(firstname);
   }
   public void Enter_Last_Name(String lastname) {
	   Last_Name.sendKeys(lastname);
   }
   public void Enter_Mobile_Number(String reg_email_) {
	   Mobile_Number.sendKeys(reg_email_);
   }
   public void Enter_New_Password(String reg_passwd_) {
	   New_Password.sendKeys(reg_passwd_);
   }
   public void Enter_Birthday_Month(String month) {
	   Birthday_Month.sendKeys(month);
   }
   public void Enter_Birthday_Day(String day) {
	   Birthday_Day.sendKeys(day);
   }
   public void Enter_Birthday_Year(String year) {
	   Birthday_Year.sendKeys(year);
   }
   public void Select_Gender(String sex) {
	   Gender.sendKeys(sex);
   }

   public void Click_Sign_Up_Button() {
	   Sign_Up_Button.click();
   }
 }
