package MyStoreTestCases;

import org.testng.annotations.Test;

import Ecommerce.GenericUtility.BaseClass;
import EcommercePageObjectRepo.IndexPage;

public class indexPageTest extends BaseClass {
	IndexPage indexPage;
	
	@Test(groups = "smoke")
	public void varifyLogo() {
		indexPage=new IndexPage(driver);
		
		boolean logo = indexPage.getMyStoreLogo().isDisplayed();
		//Assert.assertTrue(logo);
		System.out.println(logo);
		}
        
}
