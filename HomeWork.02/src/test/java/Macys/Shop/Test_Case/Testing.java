package Macys.Shop.Test_Case;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Macys.Shop.Register;



public class Testing {
	WebDriver driver = new ChromeDriver();
	Register register = new Register(driver);
	
	String first_name = RandomStringUtils.randomAlphabetic(10);
	String last_name = RandomStringUtils.randomAlphabetic(10);
	String email = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
	String password = RandomStringUtils.randomAlphanumeric(10);
	
	@BeforeTest
	public void Before_Test() throws IOException {
		driver.get("https://www.macys.com/account/createaccount?cm_sp=my_account-_-sign_in-_-create_account");
	}
	@AfterTest
	public void After_Test() {
		driver.close();
	}
	@Test
	public void Test_Case_1() {
		register.Enter_First_Name(first_name);
		register.Enter_Last_Name(last_name);
		register.Enter_Email_Address(email);
		register.Enter_Password(password);
		register.Enter_Birthday_Month("birth_month");
		register.Enter_Birthday_Day("birth_day");
		
	}
	
}

