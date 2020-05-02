package Demo.Open_Cart_Test_Case;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Demo.Open_Cart.Account_Page;
import Demo.Open_Cart.Home_Page;
import Demo.Open_Cart.Login_Page;
import Demo.Open_Cart.Register_Page;
import Utils.Config_Data;

public class Demo_Open_Cart_Test_Case {

	WebDriver driver = new ChromeDriver();
	Account_Page account_page = new Account_Page(driver);
	Home_Page home_page = new Home_Page(driver);
	Login_Page login_page = new Login_Page(driver);
	Register_Page register_page = new Register_Page(driver);
	
	String first_name = RandomStringUtils.randomAlphabetic(10);
	String last_name = RandomStringUtils.randomAlphabetic(10);
	String email = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
	String telephone = "470"+ RandomStringUtils.randomAlphanumeric(7);
	
	
	@BeforeTest
	public void Before_Test() throws IOException { 
		driver.get("https://demo.opencart.com/");
	}
	
	@AfterTest
	public void After_Test() {
		driver.close();
	}	
	@Test
	public void Positive_Register_Account() throws IOException {
		Config_Data config = new Config_Data();
		home_page.Register();
		register_page.Enter_First_Name(first_name);
		register_page.Enter_Last_Name (last_name);
		register_page.Enter_Email(email);
		register_page.Enter_Telephone(telephone);
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Click_Continue_Button();
	}
	@Test
	public void Negative_Register_Account_Without_First_Name() throws IOException {
		Config_Data config = new Config_Data();
		home_page.Register();
		register_page.Enter_Last_Name(last_name);
		register_page.Enter_Email(email);
		register_page.Enter_Telephone(telephone);
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Click_Continue_Button();
	}
	@Test
	public void Negative_Register_Account_Without_Last_Name() throws IOException {
		Config_Data config = new Config_Data();		
		home_page.Register();
		register_page.Enter_First_Name(first_name);
		register_page.Enter_Email(email);
		register_page.Enter_Telephone(telephone);
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Click_Continue_Button();
	}
	@Test
	public void Negative_Register_Account_Without_Email() throws IOException {
		Config_Data config = new Config_Data();
		home_page.Register();
		register_page.Enter_First_Name(first_name);
		register_page.Enter_Last_Name(last_name);
		register_page.Enter_Telephone(telephone);
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Click_Continue_Button();
	}
	@Test
	public void Negative_Register_Account_Without_Telephone() throws IOException {
		Config_Data config = new Config_Data();
		home_page.Register();
		register_page.Enter_First_Name(first_name);
		register_page.Enter_Last_Name(last_name);
		register_page.Enter_Email(email);
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Click_Continue_Button();
	}
	@Test
	public void Negative_Register_Account_Without_Password() throws IOException {
		Config_Data config = new Config_Data();
		home_page.Register();
		register_page.Enter_First_Name(first_name);
		register_page.Enter_Last_Name(last_name);
		register_page.Enter_Email(email);
		register_page.Enter_Telephone(telephone);
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Click_Continue_Button();
	}
	@Test
	public void Negative_Register_Account_Without_Confirm_Password() throws IOException {
		Config_Data config = new Config_Data();
		home_page.Register();
		register_page.Enter_First_Name(first_name);
		register_page.Enter_Last_Name(last_name);
		register_page.Enter_Email(email);
		register_page.Enter_Telephone(telephone);
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Click_Agree();
		register_page.Click_Continue_Button();
	}
	@Test
	public void Negative_Register_Account_Without_Click_Agree() throws IOException {
		Config_Data config = new Config_Data();
		home_page.Register();
		register_page.Enter_First_Name(first_name);
		register_page.Enter_Last_Name(last_name);
		register_page.Enter_Email(email);
		register_page.Enter_Telephone(telephone);
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Enter_Password(config.property.getProperty("password"));
		register_page.Click_Continue_Button();
	}
	@Test
	public void Positive_Login() throws IOException {
		Config_Data config = new Config_Data();
		home_page.Login();
		login_page.Enter_Email(email);
		login_page.Enter_Password(config.property.getProperty("password"));
		login_page.Click_Login_Button();
	}
	@Test
	public void Negative_Login_Without_Email() throws IOException {
		Config_Data config = new Config_Data();
		home_page.Login();
		login_page.Enter_Password(config.property.getProperty("password"));
		login_page.Click_Login_Button();
	}
	@Test
	public void Negative_Login_Without_Password() {
		home_page.Login();
		login_page.Enter_Email(email);
		login_page.Click_Login_Button();
	}
	@Test
	public void Positive_Account_Verification() throws IOException, InterruptedException {
		Config_Data config = new Config_Data();
		home_page.Login();
		login_page.Enter_Email(config.property.getProperty("email"));
		login_page.Enter_Password(config.property.getProperty("password"));
		login_page.Click_Login_Button();
		account_page.Click_My_Account_Information();
		assertEquals(account_page.Validate_First_Name(),config.property.getProperty("first_name"));
		assertEquals(account_page.Validate_Last_Name(),config.property.getProperty("last_name"));
		assertEquals(account_page.Validate_Email(),config.property.getProperty("email"));
		assertEquals(account_page.Validate_Telephone(),config.property.getProperty("telephone"));
		login_page.Log_Out();
	}
	
}
