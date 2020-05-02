package Yahoo;

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
	@FindBy(id="usernamereg-firstName")
	WebElement First_Name;
	
	@FindBy(id="usernamereg-lastName")
	WebElement Last_Name;
	
	@FindBy(id="usernamereg-yid")
	WebElement Email_Address;
	
	@FindBy(id="usernamereg-password")
	WebElement Password;
	
	@FindBy(id="usernamereg-phone")
	WebElement Phone_Number;
	
	@FindBy(id="usernamereg-month")
	WebElement Birth_Month;
	
	@FindBy(id="usernamereg-day")
	WebElement Day;
	
	@FindBy(id="usernamereg-year")
	WebElement Year;
	
	@FindBy(id="usernamereg-gender container")
	WebElement Gender;
	
	
	 
	   
	 public void Enter_First_Name(String first_name ) {
		   First_Name.sendKeys(first_name);
	 }
	 public void Enter_Lasst_Name(String last_name ) {
		    Last_Name.sendKeys(last_name);
	 }
	 public void Enter_Email(String email ) {
		 Email_Address.sendKeys(email);
	 }	   
	 public void Enter_Password(String password ) {
		 Password.sendKeys(password);
	 }	   
	 public void Enter_Phone_Number(String phone ) {
		 Phone_Number.sendKeys(phone);
	 }	   
	 public void Enter_Birth_Month(String month ) {
		 Birth_Month.sendKeys(month);
	 }	   
	 public void Enter_Day(String day ) {
		 Day.sendKeys(day);
	 }	   
	 public void Enter_Year(String year ) {
		 Year.sendKeys(year);
	 }
	 public void Enter_Gender(String gender ) {
		 Gender.sendKeys(gender);
	 }	   

}
