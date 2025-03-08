package MyStoreTestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import EcommercePageObjectRepo.AddToCartPage;
import EcommercePageObjectRepo.DeliveryAddressPage;
import EcommercePageObjectRepo.IndexPage;
import EcommercePageObjectRepo.LoginPage;
import EcommercePageObjectRepo.OrderPage;
import EcommercePageObjectRepo.OrderSummaryPage;
import EcommercePageObjectRepo.PaymentPage;
import EcommercePageObjectRepo.SearchResultPage;
import EcommercePageObjectRepo.ShippingPage;

import Ecommerce.GenericUtility.BaseClass;

public class EndToEndTest extends BaseClass{
	IndexPage indexPage;
	SearchResultPage searchResultPage;
	AddToCartPage addToCartPage;
	OrderPage orderPage;
	LoginPage loginPage;
	DeliveryAddressPage deliveryAddressPage;
	ShippingPage shippingPage;
	PaymentPage paymentPage;
	OrderSummaryPage orderSummaryPage;
	
	@Test(groups = "smoke")
	public void endToEndTest() throws IOException {
		indexPage=new IndexPage(driver);
		searchResultPage=new SearchResultPage(driver);
		addToCartPage=new AddToCartPage(driver);
		orderPage=new OrderPage(driver);
		loginPage=new LoginPage(driver);
		deliveryAddressPage=new DeliveryAddressPage(driver);
		shippingPage=new ShippingPage(driver);
		paymentPage=new PaymentPage(driver);
		orderSummaryPage=new OrderSummaryPage(driver);
		
		indexPage.getSearchProductBox().sendKeys("Blouse");
		indexPage.getSearchButton().click();
		searchResultPage.getProductResult().click();
		WebElement dropDown = addToCartPage.getDropDownForSize();
		dropDown.click();
		wUtil.tohandleDropDown(dropDown, "2");
		addToCartPage.getColorBox().click();
		addToCartPage.getQuantityButton().click();
		addToCartPage.getAddCartButton().click();
		addToCartPage.getProceedToCheckOutButton().click();
		orderPage.getProceedToCheckoutButton().click();
		String userName = putil.toReadDataFromPropertyFile("email");
		String passWord = putil.toReadDataFromPropertyFile("password");
		loginPage.getUserName().sendKeys(userName);
		loginPage.getPassword().sendKeys(passWord);
		loginPage.getSignButton().click();
		deliveryAddressPage.getProceedToCheckOutButton().click();
		shippingPage.getCheckboxButton().click();
		shippingPage.getProceedToCheckOutButton().click();
		paymentPage.getChequeMethod().click();
		orderSummaryPage.getConfirmButton().click();
		
		
		
		
		
		
	}
	
	

}
