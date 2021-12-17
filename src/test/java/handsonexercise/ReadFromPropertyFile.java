package handsonexercise;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

import utilities.Helper;



public class ReadFromPropertyFile {
	@Test
	public void ReadFromPropertyFileTest() throws Exception {
		String file = "src\\test\\resources\\credentials.prop";
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("browser"));
	}

	@Test
	public void readFromHelperClass() {
		String filePath = "src\\\\test\\\\resources\\\\credentials.prop";
		Helper help = new Helper();
//		System.out.println(help.readFromPropFile(filePath, "browser"));
	}
}
