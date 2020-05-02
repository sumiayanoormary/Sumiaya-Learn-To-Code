package New.Tour.Test_Case;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import New.Tour.Register;

public class Testing {
	WebDriver driver = new ChromeDriver();
	Register register = new Register(driver);
	
	
	String first_name = RandomStringUtils.randomAlphabetic(10);
	String last_name = RandomStringUtils.randomAlphabetic(10);
	String email = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
	String telephone = "470"+ RandomStringUtils.randomAlphanumeric(7);
	
	
	@BeforeTest
	public void Before_Test() throws IOException { 
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
	}
	
	@AfterTest
	public void After_Test() {
		driver.close();
	}
	
	@Test
	public void Test_Case_1() throws InterruptedException {
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		System.out.println("Title= "+ register.Get_Title());
		
		
	}
	
	@Test
	public void Test_Case_2() {
		register.Enter_First_Name(first_name);
		register.Enter_Last_Name(last_name);
		register.Enter_Phone(telephone);
		register.Enter_Email(email);
		register.Enter_Address("I HAVE NOT IDEA");
		register.Enter_City("Suwanee");
		register.Enter_State("Georgia");
		register.Enter_ZipCode("30043");
		register.Enter_Country("207");
		register.Enter_User_Name("Sumiaya123");
		register.Enter_Password("abcd1234");
		register.Enter_Confirm_Password("abcd1234");
		register.Enter_Submit_Button();
		
	}

}
