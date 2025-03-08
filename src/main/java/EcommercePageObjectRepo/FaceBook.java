package EcommercePageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook {
	public FaceBook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//a[text()='Sign Up'][1]")
	private WebElement faceBookLogo;
	public WebElement getFaceBookLogo() {
		return faceBookLogo;
	}

}
