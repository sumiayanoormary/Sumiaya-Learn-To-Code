package Php.Travel.Test_Case;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Php.Travels.Register;

public class Testing {
	WebDriver driver = new ChromeDriver();
	Register register = new Register(driver);

	String first_name = RandomStringUtils.randomAlphabetic(10);
	String last_name = RandomStringUtils.randomAlphabetic(10);
	String email = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
	String telephone = "470"+ RandomStringUtils.randomAlphanumeric(7);
	
	@BeforeTest
	public void Before_Test() throws IOException { 
		driver.get("https://www.phptravels.net/register");
	}

	@AfterTest
	public void After_Test() {
		driver.close();
	}
	
	@Test
	public void Test_Case_1() {
		register.Enter_First_Name(first_name);
		register.Enter_Last_Name(last_name);
		register.Enter_Mobile_Number(telephone);
		register.Enter_Email(email);
		register.Enter_Password("abcd12345");
		register.Enter_Confirm_Password("abcd12345");
	}
	
	@Test
	public void Test_Case_2() throws InterruptedException {
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		System.out.println("Button Text= "+register.Read_Submit_Button());
		
	}
	
}
	
