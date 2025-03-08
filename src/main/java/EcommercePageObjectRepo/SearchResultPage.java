package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	public SearchResultPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@src='http://www.automationpractice.pl/img/p/7/7-home_default.jpg']")
	private WebElement productResult;
	
	public WebElement getProductResult() {
		return productResult;
	}
	
	

}
