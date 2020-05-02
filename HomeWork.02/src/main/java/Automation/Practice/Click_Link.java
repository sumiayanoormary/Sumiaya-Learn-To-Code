package Automation.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_Link {

	WebDriver driver;
	
	public Click_Link(WebDriver driver) {
		   this.driver= driver;
		   PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(1)")
	WebElement Specials;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(2)")
	WebElement New_Products;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(3)")
	WebElement Best_Sellers;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(4)")
	WebElement Our_Stores;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(5)")
	WebElement Contact_Us;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(6)")
	WebElement Terms;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(7)")
	WebElement About_Us;
	
	@FindBy(css="#block_various_links_footer > ul > li:nth-child(8)")
	WebElement SiteMap;
	
	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	WebElement Sign_In;
	
	
	public void Click_Special() {
		Specials.click();
	}
	
	public void Click_New_Product() {
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
	
	public void Click_Terms() {
		Terms.click();
	}
	
	public void Click_About_Us() {
		About_Us.click();
	}
	
	public void Click_Site_Map() {
		SiteMap.click();
	}
	
	public void Click_Sign_In() {
		Sign_In.click();
	}
}
