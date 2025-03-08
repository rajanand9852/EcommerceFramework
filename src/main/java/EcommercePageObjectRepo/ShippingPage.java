package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
	public ShippingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkboxButton;
	
	@FindBy(xpath = "//button/span[contains(text(),'Proceed to checkout')]")
	private WebElement proceedToCheckOutButton;

	public WebElement getCheckboxButton() {
		return checkboxButton;
	}

	public WebElement getProceedToCheckOutButton() {
		return proceedToCheckOutButton;
	}	

}
