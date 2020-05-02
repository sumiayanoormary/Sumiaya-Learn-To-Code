package Automation.Practice.Test_Case;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Automation.Practice.Click_Link;

public class Testing {
	WebDriver driver = new ChromeDriver();
	Click_Link click_link= new Click_Link(driver);
	
	
	
	@BeforeTest
	public void Before_Test() throws IOException { 
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@AfterTest
	public void After_Test() {
		driver.close();
	}
	
	@Test
	public void Test_Case_1() throws InterruptedException {
		click_link.Click_Special();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		click_link.Click_Sign_In();
	}
	@Test
	public void Test_Case_2() throws InterruptedException {
		click_link.Click_New_Product();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		click_link.Click_Sign_In();
	}
	@Test
	public void Test_Case_3() throws InterruptedException {
		click_link.Click_Best_Sellers();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		click_link.Click_Sign_In();
	}
	@Test
	public void Test_Case_4() throws InterruptedException {
		click_link.Click_Our_Stores();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		click_link.Click_Sign_In();
	}
	@Test
	public void Test_Case_5() throws InterruptedException {
		click_link.Click_Contact_Us();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		click_link.Click_Sign_In();
	}
	
	@Test
	public void Test_Case_6() throws InterruptedException {
		click_link.Click_Terms();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		click_link.Click_Sign_In();
	}
	@Test
	public void Test_Case_7() throws InterruptedException {
		click_link.Click_About_Us();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		click_link.Click_Sign_In();
	}
	@Test
	public void Test_Case_8() throws InterruptedException {
		click_link.Click_Site_Map();
		Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("Url= "+url);
		click_link.Click_Sign_In();
	}
}
