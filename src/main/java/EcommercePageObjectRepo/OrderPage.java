package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	
	public OrderPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//li[@class='price']")
	private WebElement unitPrice;
	
	@FindBy(xpath = "//span[@id='total_price']")
	private WebElement totalPrice;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement proceedToCheckoutButton;

	public WebElement getUnitPrice() {
		return unitPrice;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getProceedToCheckoutButton() {
		return proceedToCheckoutButton;
	}
	

}
