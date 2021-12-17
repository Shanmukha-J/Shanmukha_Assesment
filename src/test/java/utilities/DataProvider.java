package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Assert;

public class DataProvider {
	public static String getTestData(String propFile, String propName) {
		
		Properties prop = new Properties();
		try {
			FileInputStream fis= new FileInputStream(propFile);
			prop.load(fis);
			
		}catch(Exception ex) {
			Assert.fail("FAIL | IO EXCEPTION THROWN . please chech the file path");
		}
		
		return prop.getProperty(propName);
	}
}
