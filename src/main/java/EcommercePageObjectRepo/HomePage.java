package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[text()='Sign out']")
	private WebElement SignOut;
	
	
	@FindBy(xpath = "//span[text()='Add my first address']")
	 private WebElement addMyFirstAddress;
	
	@FindBy(xpath="Order history and details")
	private WebElement orderHistory;
	
	
	
	
	public WebElement getOrderHistory() {
		
		return orderHistory;
	}
     public WebElement getAddMyFirstAddress() {
		return addMyFirstAddress;
	}
     public WebElement getSignOut() {
		return SignOut;
    	 
     }
	
	
	

}
