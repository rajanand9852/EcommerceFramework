package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationPage {

	public AccountCreationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//h1[text()='Create an account']")
	private WebElement AccountCreationPageTitle;
	
	@FindBy(xpath = "//input[@name='id_gender']")
	private WebElement radioButton;
	
	@FindBy(id="customer_firstname")
	private WebElement FirstnameTextField;
	
	@FindBy (id="customer_lastname")
	private WebElement LastnameTextField;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement PasswordTextField;
	
	@FindBy(id = "days")
	private WebElement DropDownButtonDays;
	
	@FindBy(id = "months")
	private WebElement DropDownButtonMonths;
	
	@FindBy(id="years")
	private WebElement dropDownButtonYears;	
	
	@FindBy(xpath = "//span[text()='Register']")
	private WebElement RegisterButton;

	public WebElement getAccountCreationPageTitle() {
		return AccountCreationPageTitle;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getFirstnameTextField() {
		return FirstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return LastnameTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getDropDownButtonDays() {
		return DropDownButtonDays;
	}

	public WebElement getDropDownButtonMonths() {
		return DropDownButtonMonths;
	}

	public WebElement getDropDownButtonYears() {
		return dropDownButtonYears;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

}
