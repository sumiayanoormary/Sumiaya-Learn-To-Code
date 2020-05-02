package Automation.Sumiaya_Test_Case;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Automation.Sumiaya.Information;


public class Testing {
	WebDriver driver = new ChromeDriver();
	Information information = new Information(driver);
	 
	 @BeforeTest
	 public void Before_Test()throws IOException{
		 driver.get("http://automationpractice.com/index.php?controller=authentication&amp;back=my-account");
	 }
	 @AfterTest
	 public void After_Test() {
		 driver.close();
	 } 
	 @Test
	 public void Test_Case_1() throws IOException {
		 
	 }
	

}
