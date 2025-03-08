package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFirstAddressPage {
	public AddFirstAddressPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//select[@id='id_state']")
	private WebElement stateDropDown;
	
	
	public WebElement getStateDropDown() {
		return stateDropDown;
	}
	@FindBy(id="firstname")
	private WebElement EnterFirstNam;
	
	@FindBy (id="lastname")
	private WebElement EnterLastName;
	
	@FindBy(xpath = "//input[@id='company']")
	private WebElement EnterCompanyName;
	
	@FindBy(id="address1")
	private WebElement addressNamElement;
	
	@FindBy(id="city")
	private WebElement cityName;
	
	@FindBy(id="phone")
	private WebElement phoneNo;
	
	@FindBy(id="phone_mobile")
	private WebElement mobileNo;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement saveButtonElement;

	public WebElement getEnterFirstNam() {
		return EnterFirstNam;
	}

	public WebElement getEnterLastName() {
		return EnterLastName;
	}

	public WebElement getEnterCompanyName() {
		return EnterCompanyName;
	}

	public WebElement getAddressNamElement() {
		return addressNamElement;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getSaveButtonElement() {
		return saveButtonElement;
	}

}
