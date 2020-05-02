package Macys.Shop;

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
	@FindBy(id= "ca-profile-firstname")
	WebElement First_Name;
	
	@FindBy(id="ca-profile-lastname")
	WebElement Last_Name;
	
	@FindBy(id="ca-profile-email")
	WebElement Email_Address;
	
	@FindBy(id="ca-profile-password")
	WebElement Password;
	
	@FindBy(id="ca-profile-birth-month")
	WebElement Birthday_Month;
	
	@FindBy(id="ca-profile-birth-day")
	WebElement Birthday_Day;
	
	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	WebElement Sing_In;
	
	public void Enter_First_Name(String first_name) {
		First_Name.sendKeys(first_name);
	}
	public void Enter_Last_Name(String last_name) {
		Last_Name.sendKeys(last_name);
	}
	public void Enter_Email_Address(String email_address) {
		Email_Address.sendKeys(email_address);
	}
	public void Enter_Password(String password) {
		Password.sendKeys(password);
	}
	public void Enter_Birthday_Month(String birth_month) {
		Birthday_Month.sendKeys(birth_month);
	}
	public void Enter_Birthday_Day(String birth_day) {
		Birthday_Day.sendKeys(birth_day);
	}

}
