package MyStoreTestCases;

import org.testng.annotations.Test;

import Ecommerce.GenericUtility.BaseClass;
import EcommercePageObjectRepo.IndexPage;
import EcommercePageObjectRepo.LoginPage;

public class LoginPageTest extends BaseClass {
	 IndexPage indexpage;
	 LoginPage loginpage;
	
	
	@Test (groups = "smoke")
	public void loginTest() {
		indexpage= new IndexPage(driver);
		loginpage=new LoginPage(driver);
		indexpage.getSignButton().click();
		//loginpage.getNewEmailAddress().sendKeys("anand123@gmail.com");
		//loginpage.getCreateAnAccountButton().click();
		
	}

}
