package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantityButton;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement dropDownForSize;
	
	@FindBy(xpath="//a[@name='White']")
	private WebElement colorBox;
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	private WebElement addCartButton;
	
	@FindBy(xpath = "//i[@class='icon-check']")
	private WebElement validateToAddCart;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckOutButton;

	public WebElement getQuantityButton() {
		return quantityButton;
	}

	public WebElement getDropDownForSize() {
		return dropDownForSize;
	}

	public WebElement getColorBox() {
		return colorBox;
	}

	public WebElement getAddCartButton() {
		return addCartButton;
	}

	public WebElement getValidateToAddCart() {
		return validateToAddCart;
	}

	public WebElement getProceedToCheckOutButton() {
		return proceedToCheckOutButton;
	}

}
