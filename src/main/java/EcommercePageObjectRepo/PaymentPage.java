package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bankwireMethod;
	
	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement chequeMethod;

	public WebElement getBankwireMethod() {
		return bankwireMethod;
	}

	public WebElement getChequeMethod() {
		return chequeMethod;
	}

}
