package MyStoreTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Ecommerce.GenericUtility.BaseClass;
import Ecommerce.GenericUtility.ExcelFileUtility;
import Ecommerce.GenericUtility.JavaUtility;
import EcommercePageObjectRepo.AccountCreationPage;
import EcommercePageObjectRepo.IndexPage;
import EcommercePageObjectRepo.LoginPage;

public class AccountCreationPageTest extends BaseClass {
	IndexPage indexPage;
	LoginPage loginPage;
	AccountCreationPage accountCreationPage;
	ExcelFileUtility eUtil=new ExcelFileUtility();
	JavaUtility jUtil=new JavaUtility();
    	
	
	@Test(groups = "regression")
	public void AccountCreationTest() throws EncryptedDocumentException, IOException {
		indexPage=new IndexPage(driver);
		loginPage=new LoginPage(driver);
		
		
		accountCreationPage=new AccountCreationPage(driver);
		indexPage.getSignButton().click();
		String newEmail = eUtil.toReadtheDatafromexcelFile("AccountCreation", 1, 6) +jUtil.getRandomNumber();
		loginPage.getNewEmailAddress().sendKeys(newEmail);
		loginPage.getCreateAnAccountButton().click();
		accountCreationPage.getRadioButton().click();
		
		String firstName = eUtil.toReadtheDatafromexcelFile("AccountCreation", 1, 0);
		String lastName = eUtil.toReadtheDatafromexcelFile("AccountCreation", 1, 1);
		String password = eUtil.toReadtheDatafromexcelFile("AccountCreation", 1, 2);
		accountCreationPage.getFirstnameTextField().sendKeys(firstName);
		accountCreationPage.getLastnameTextField().sendKeys(lastName);
		accountCreationPage.getPasswordTextField().sendKeys(password);
		WebElement dayDropDown = accountCreationPage.getDropDownButtonDays();
		dayDropDown.click();
		wUtil.tohandleDropDown(dayDropDown, "4");
		WebElement monthsDropdown = accountCreationPage.getDropDownButtonMonths();
		monthsDropdown.click();
		wUtil.tohandleDropDown(monthsDropdown, "1");
		WebElement yearsDropDown = accountCreationPage.getDropDownButtonYears();
		yearsDropDown.click();
		wUtil.toHandleDropDown(yearsDropDown, 2);
		accountCreationPage.getRegisterButton().click();
		
		
	}

}
