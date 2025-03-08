package MyStoreTestCases;

import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import Ecommerce.GenericUtility.BaseClass;
import EcommercePageObjectRepo.AddToCartPage;
import EcommercePageObjectRepo.IndexPage;
import EcommercePageObjectRepo.OrderPage;
import EcommercePageObjectRepo.SearchResultPage;

public class orderPageTest extends BaseClass{
	IndexPage index;
	SearchResultPage searchresult;
	AddToCartPage cartPage;
	OrderPage orderpage;
	@Test(groups = "regression")
	public void toCheckProductPrice() {
		index=new IndexPage(driver);
		cartPage=new AddToCartPage(driver);
		searchresult=new SearchResultPage(driver);
		orderpage=new OrderPage(driver);
		index.getSearchProductBox().sendKeys("Blouse");
		index.getSearchButton().click();
		searchresult.getProductResult().click();
		WebElement dropDown = cartPage.getDropDownForSize();
		dropDown.click();
		wUtil.tohandleDropDown(dropDown, "2");
		cartPage.getColorBox().click();
		cartPage.getQuantityButton().click();
		cartPage.getAddCartButton().click();
		cartPage.getProceedToCheckOutButton().click();
		String unitprice = orderpage.getUnitPrice().getText();
		String UnitPrice = unitprice.replaceAll("[^a-zA-Z0-9]", " ");
		double finalUnitPrice = Double.parseDouble(UnitPrice);
		double finalUnitPrice1 = finalUnitPrice*2;
		double totalExcepted = finalUnitPrice1+7;
		String totalprice = orderpage.getTotalPrice().getText();
		String totalprice1 = totalprice.replaceAll("[^a-zA-Z0-9]"," ");
		double finalTotalPrice = Double.parseDouble(totalprice1);
		AssertJUnit.assertEquals(totalExcepted, finalTotalPrice);
		
		
		
		
		
	}

}
