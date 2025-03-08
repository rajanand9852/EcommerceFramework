package Ecommerce.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class consist of method to read data from properties file
 */

public class PropertityFileUtility {
	/**
	 * The data from property file provide key
	 * @throws IOException 
	 * @param key
	 *@return string 
	 */
	public String toReadDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}

	

}
