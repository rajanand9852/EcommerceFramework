package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
	public OrderSummaryPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
	private WebElement confirmButton;

	public WebElement getConfirmButton() {
		return confirmButton;
	}

}

