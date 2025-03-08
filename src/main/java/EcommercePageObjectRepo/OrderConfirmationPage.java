package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
	
	public OrderConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//p[text()='Your order on My Shop is complete.']")
	private WebElement confirmationMessage;
	public WebElement getConfirmationMessage() {
		return confirmationMessage;
	}

}
