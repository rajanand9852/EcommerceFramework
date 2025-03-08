package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//button[@id='SubmitCreate']")
	private WebElement createAnAccountButton;
	
	@FindBy(xpath = "//input[@id='email_create']")
	private WebElement newEmailAddress;
	
	public WebElement getCreateAnAccountButton() {
		return createAnAccountButton;
	}

	public WebElement getNewEmailAddress() {
		return newEmailAddress;
	}
	@FindBy(xpath = "//input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement signButton;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignButton() {
		return signButton;
	}
	
	

}
