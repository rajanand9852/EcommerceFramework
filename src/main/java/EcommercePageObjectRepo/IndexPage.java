package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

	public IndexPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signInButton;
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	private WebElement myStoreLogo;
	
	public WebElement getSignInButton() {
		return signInButton;
	}

	public WebElement getMyStoreLogo() {
		return myStoreLogo;
	}

	@FindBy(id="search_query_top")
	private WebElement searchProductBox;
	
	@FindBy(name="submit_search")
	private WebElement searchButton;
	

	public WebElement getMyStoreLogoElement() {
		return myStoreLogo;
	}

	public WebElement getSearchProductBox() {
		return searchProductBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSignButton() {
		return signInButton;
	}
	

    }
