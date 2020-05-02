package Demo.Open_Cart_Noor;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Demo.Open_Cart.Register_Page;
import Demo.Open_Cart.Noor.Account_Page_Noor;
import Demo.Open_Cart.Noor.Home_Page_Noor;
import Demo.Open_Cart.Noor.Login_Page_Noor;
import Demo.Open_Cart.Noor.Register_Page_Noor;
import NoorUtils.Config_Data_Noor;
import Utils.Config_Data;

public class Demo_Open_Cart_Test_Case_Noor {
	
	WebDriver driver =  new ChromeDriver();
	Account_Page_Noor account_page = new Account_Page_Noor(driver);
	Home_Page_Noor home_page  = new Home_Page_Noor(driver);
	Login_Page_Noor login_page = new Login_Page_Noor(driver);
	Register_Page_Noor register_page = new Register_Page_Noor(driver);
   
	String First_Name = RandomStringUtils.randomAlphabetic(10);
	String Last_Name = RandomStringUtils.randomAlphabetic(10);
	String Email = RandomStringUtils.randomAlphabetic(10) +"@gmail.com";
	String Telephone = "470"+ RandomStringUtils.randomAlphanumeric(7);
	
	@BeforeTest
	public void Before_Test() throws IOException {
	    driver.get("https://demo.opencart.com/");
	}
	
	@AfterTest
	public void After_Test() {
		driver.close();
	}
	@Test (priority=1)
	public void Positive_Register_Account () throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
	    home_page.Register();
	    register_page.Enter_First_Name(First_Name);
	    register_page.Enter_Last_Name(Last_Name);
	    register_page.Enter_Email(Email);
	    register_page.Enter_Telephone(Telephone);
	    register_page.Enter_Password(config.Property.getProperty("password"));
	    register_page.Enter_Confirm_Password(config.Property.getProperty("password"));
	    register_page.Click_Agree();
	    register_page.Continue_Button();
	    login_page.Log_Out();
	    
	    
	}  
	@Test (priority=2)
	public void Neagtive_Register_Account_Without_First_Name() throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
		home_page.Register();
		register_page.Enter_First_Name(Last_Name);
		register_page.Enter_Last_Name(Email);
		register_page.Enter_Telephone(Telephone);
		register_page.Enter_Password(config.Property.getProperty("password"));
		register_page.Enter_Confirm_Password(config.Property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Continue_Button();
	
	}
	@Test (priority=3)
	public void Negative_Register_Account_Without_Last_Name() throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
		home_page.Register();
		register_page.Enter_First_Name(First_Name);
		register_page.Enter_Email(Email);
		register_page.Enter_Telephone(Telephone);
		register_page.Enter_Password(config.Property.getProperty("password"));
		register_page.Enter_Confirm_Password(config.Property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Continue_Button();
		
	}
	@Test (priority=4)
	public void Negative_Register_Account_Without_Email() throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
		home_page.Register();
		register_page.Enter_First_Name(First_Name);
		register_page.Enter_Last_Name(Last_Name);
		register_page.Enter_Telephone(Telephone);
		register_page.Enter_Password(config.Property.getProperty("password"));
		register_page.Enter_Confirm_Password(config.Property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Continue_Button();
		
	}
	@Test (priority=5)
	public void Negative_Register_Account_Without_Telephone() throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
		home_page.Register();
		register_page.Enter_First_Name(First_Name);
		register_page.Enter_Last_Name(Last_Name);
		register_page.Enter_Email(Email);
		register_page.Enter_Password(config.Property.getProperty("password"));
		register_page.Enter_Confirm_Password(config.Property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Continue_Button();
		
	}
	@Test (priority=6)
	public void Negative_Register_Account_Without_Password() throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
		home_page.Register();
		register_page.Enter_First_Name(First_Name);
		register_page.Enter_Last_Name(Last_Name);
		register_page.Enter_Email(Email);
		register_page.Enter_Telephone(Telephone);
		register_page.Enter_Confirm_Password(config.Property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Continue_Button();
		
	}
	@Test (priority=7)
	public void Negative_Rgister_Account_Without_Confirm_Password() throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
		home_page.Register();
		register_page.Enter_First_Name(First_Name);
		register_page.Enter_Last_Name(Last_Name);
		register_page.Enter_Email(Email);
		register_page.Enter_Telephone(Telephone);
		register_page.Enter_Password(config.Property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Continue_Button();
		
	}
	@Test (priority=8)
	public void Negative_Register_Account_Without_Click_Agree() throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
		home_page.Register();
		register_page.Enter_First_Name(First_Name);
		register_page.Enter_Last_Name(Last_Name);
		register_page.Enter_Email(Email);
		register_page.Enter_Telephone(Telephone);
		register_page.Enter_Password(config.Property.getProperty("password"));
		register_page.Enter_Confirm_Password(config.Property.getProperty("password"));
		register_page.Continue_Button();
		
	}
	@Test (priority=9)
	public void Negative_Register_Account_Without_Continue_Button() throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
		home_page.Register();
		register_page.Enter_First_Name(First_Name);
		register_page.Enter_Last_Name(Last_Name);
		register_page.Enter_Email(Email);
		register_page.Enter_Telephone(Telephone);
		register_page.Enter_Password(config.Property.getProperty("password"));
		register_page.Enter_Confirm_Password(config.Property.getProperty("password"));
		register_page.Click_Agree();
		
	}
	@Test
	public void Positive_Login() throws IOException {
		Config_Data_Noor config= new Config_Data_Noor();
		home_page.Login();
		login_page.Enter_Email(config.Property.getProperty("email"));
		login_page.Enter_Password(config.Property.getProperty("password"));
		login_page.Click_Login_Button();
		login_page.Log_Out();
		
	}
	@Test
	public void Negative_Login_Without_Email() throws IOException  {
		Config_Data_Noor config= new Config_Data_Noor();
		home_page.Login();
		login_page.Enter_Password(config.Property.getProperty("password"));
		login_page.Click_Login_Button();
	}	
	@Test
	public void Negative_Login_Without_Password() {
		home_page.Login();
		login_page.Enter_Email(Email);
		login_page.Click_Login_Button();
	}
	@Test
	public void Positive_Account_Verification() throws IOException {
		Config_Data_Noor config = new Config_Data_Noor();
		home_page.Login();
		login_page.Enter_Email(config.Property.getProperty("email"));
		login_page.Enter_Password(config.Property.getProperty("password"));
		login_page.Click_Login_Button();
		account_page.Click_My_Account_Information();
		assertEquals(account_page.Validate_First_Name(),config.Property.getProperty("first_name"));
		assertEquals(account_page.Validate_Last_Name(),config.Property.getProperty("last_name"));
		assertEquals(account_page.Validate_Email(),config.Property.getProperty("email"));
		assertEquals(account_page.Validate_Telephone(),config.Property.getProperty("telephone"));	
	}
}
	