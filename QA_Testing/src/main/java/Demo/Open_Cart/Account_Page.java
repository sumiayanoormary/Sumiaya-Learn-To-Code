package Demo.Open_Cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class Account_Page {
		WebDriver driver;
   
   public Account_Page(WebDriver driver) {
	   this.driver= driver;
	   PageFactory.initElements(driver, this);
}
   @FindBy(linkText="Edit your account information") 
   WebElement My_Account_Information;

   @FindBy(id="input-firstname")
	WebElement First_Name;
   
   @FindBy(id="input-lastname")
   WebElement Last_Name;
   
   @FindBy(id="input-email")
   WebElement Email;
   
   @FindBy(id="input-telephone")
   WebElement Telephone;
   
   public void Click_My_Account_Information() {
	   My_Account_Information.click();
}
   public String Validate_First_Name() {
	   String firstName = First_Name.getAttribute("value");
	   return firstName;
}
   public String Validate_Last_Name() {
	   String lastName = Last_Name.getAttribute("value");
	   return lastName;
}
   public String Validate_Email() {
	   String email = Email.getAttribute("value");
	   return email;
}
   public String Validate_Telephone() {
	   String telephone = Telephone.getAttribute("value");
	   return telephone;
}
     	
}   	   
   
	


