package Automation.Sumiaya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Information {
	WebDriver driver;
	
	public Information(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(1) > a")
	WebElement Specials;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(2) > a")
	WebElement New_Products;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(3) > a")
	WebElement Best_Sellers;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(4) > a")
	WebElement Our_Stores;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(5) > a")
	WebElement Contact_Us;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(6) > a")
	WebElement Terms_And_Conditions_Of_Use;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(7) > a")
	WebElement About_Us;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(8) > a")
	WebElement SiteMap;
	
	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	WebElement Sign_In;
	
	
	public void Click_Specials() {
		Specials.click();
	}
	public void Click_New_Products() {
		New_Products.click();
	}
	public void Click_Best_Sellers() {
		Best_Sellers.click();
	}
	public void Click_Our_Stores() {
		Our_Stores.click();
	}
	public void Click_Contact_Us() {
		Contact_Us.click();
	}
	public void Click_Terms_And_Conditions_Of_Use() {
		Terms_And_Conditions_Of_Use.click();
	}
	public void Click_About_Us() {
		About_Us.click();
	}
	public void Click_SiteMap() {
		SiteMap.click();
	}
	public void Click_Sign_In() {
		Sign_In.click();
	}

}
