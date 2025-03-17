package Ecommerce.GenericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import EcommercePageObjectRepo.HomePage;
import EcommercePageObjectRepo.IndexPage;
import EcommercePageObjectRepo.LoginPage;

public class BaseClass {

	public PropertityFileUtility putil=new PropertityFileUtility();
	public WebDriverUtility wUtil=new WebDriverUtility();
	public ExcelFileUtility eUtil=new ExcelFileUtility();
	public WebDriver driver=null;
	
	

	@BeforeSuite()
	public void beforeSuitConfig() {
		System.out.println("...Database Connection established...");
	}
	
	@BeforeClass(groups = "smoke")
	public void beforeclassConfig() throws IOException {
		    String browser = putil.toReadDataFromPropertyFile("Browser");
		    //String Url = putil.toReadDataFromPropertyFile("url");
		     
		
	if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		
		}
	else if(browser.equalsIgnoreCase("Safari")) {
		driver=new SafariDriver();
	}
	System.out.println("Browser got Launched");
	wUtil.toMaximize(driver);
	System.out.println("Browser got Maximised");
	wUtil.toWaitForWebElement(driver);
	//driver.get(Url);
	
	}
	@BeforeMethod()

	public void beforeMethodConfig() throws IOException {
		String Url = putil.toReadDataFromPropertyFile("url");
		driver.get(Url);
		String Email = putil.toReadDataFromPropertyFile("email");
		String Password = putil.toReadDataFromPropertyFile("password");
		
		IndexPage IP=new IndexPage(driver);
		IP.getSignButton().click();
	    LoginPage lg=new LoginPage(driver);
	    lg.getUserName().sendKeys(Email);
	    lg.getPassword().sendKeys(Password);
	    lg.getSignButton().click();
		
	}
	@AfterMethod()
	public void afterMethodConfig() {
		HomePage hp=new HomePage(driver);
		hp.getSignOut().click();
		
		
		
	}
     @AfterClass()
	public void afterClass() {
		wUtil.toCloseTheBrowser(driver);
	}
	
	}
