package Yahoo.Test_Case;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Yahoo.Register;

	public class Testing {
		WebDriver driver = new ChromeDriver();
		Register register = new Register(driver);
		
		String first_name = RandomStringUtils.randomAlphabetic(10);
		String last_name = RandomStringUtils.randomAlphabetic(10);
		String email = RandomStringUtils.randomAlphabetic(10) + "@yahoo.com";
		String telephone = "470"+ RandomStringUtils.randomAlphanumeric(7);
		
		@BeforeTest
		public void Before_Test() throws IOException { 
			driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		}

		@AfterTest
		public void After_Test() {
			driver.close();
		}
		@Test
		public void Test_Case_1() {
			register.Enter_First_Name(first_name);
			register.Enter_Lasst_Name(last_name);
			register.Enter_Phone_Number(telephone);
			register.Enter_Email(email);
			register.Enter_Birth_Month("July");
			register.Enter_Day("21");
			register.Enter_Year("1987");
			register.Enter_Password("abcd12345");
		}


}
