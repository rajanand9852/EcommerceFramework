package MyStoreTestCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridPracticeTest {
	@Test
	public void SampleTest () throws MalformedURLException{
		ChromeOptions option=new ChromeOptions();
		URL ipAdd=new URL("http://10.10.21.120.6666");
		RemoteWebDriver driver=new RemoteWebDriver(ipAdd,option);
		driver.get("http://google.com");
		
		
		
		
	}

}
