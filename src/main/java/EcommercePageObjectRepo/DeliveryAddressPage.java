package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryAddressPage {
	
	public DeliveryAddressPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement proceedToCheckOutButton;
	
	
	
	public WebElement getProceedToCheckOutButton() {
		return proceedToCheckOutButton;
	}
	
	
	

}
