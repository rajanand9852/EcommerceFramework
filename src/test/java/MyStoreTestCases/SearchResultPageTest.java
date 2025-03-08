package MyStoreTestCases;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Ecommerce.GenericUtility.BaseClass;
import EcommercePageObjectRepo.IndexPage;
import EcommercePageObjectRepo.SearchResultPage;

public class SearchResultPageTest extends BaseClass {
	IndexPage indexPage;
	SearchResultPage searchResult;
	
	
	@Test(groups = "smoke")
	public void productAvialabilityTest() {
		indexPage=new IndexPage(driver);
		searchResult=new SearchResultPage(driver);
		
		indexPage.getSearchProductBox().sendKeys("blouse");
		indexPage.getSearchButton().click();
		boolean product = searchResult.getProductResult().isDisplayed();
		AssertJUnit.assertTrue(product);
		
	}

}
