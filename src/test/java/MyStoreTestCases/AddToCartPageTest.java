package MyStoreTestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Ecommerce.GenericUtility.BaseClass;
import EcommercePageObjectRepo.AddToCartPage;
import EcommercePageObjectRepo.IndexPage;
import EcommercePageObjectRepo.SearchResultPage;

public class AddToCartPageTest extends BaseClass {
	IndexPage index;
	SearchResultPage searchResult;
	AddToCartPage addToCartPage;
	@Test(groups = "regression")
	public void AddToCartTest() {
		index=new IndexPage(driver);
		searchResult=new SearchResultPage(driver);
		addToCartPage=new AddToCartPage(driver);
		
		index.getSearchProductBox().sendKeys("Blouse");
		index.getSearchButton().click();
		searchResult.getProductResult().click();
		
		
		 addToCartPage.getColorBox().click();
		 WebElement dropown = addToCartPage.getDropDownForSize();
		 dropown.click();
		 wUtil.tohandleDropDown(dropown, "2");
		 addToCartPage.getQuantityButton().click();
		 addToCartPage.getAddCartButton().click();
		 
		 
		
	}

}
