package MyStoreTestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Ecommerce.GenericUtility.BaseClass;
import EcommercePageObjectRepo.IndexPage;

public class JavaScriptExecutorTest extends BaseClass{
	IndexPage indexPage;
	@Test
	public void clickActionUsingJavaScriptExecutor() {
		indexPage=new IndexPage(driver);
		
		indexPage.getSearchProductBox().sendKeys("blouse");
		WebElement element = indexPage.getSearchButton();
		wUtil.clickElementByJavaScriptExecutor(driver, element);
		wUtil.toZoombyusingJavaScript(driver);
		wUtil.scrollPageTillEndByUsingJavaScript(driver);
		wUtil.scrollPageupByUsingJavaScript(driver);
	}
	
	

}
