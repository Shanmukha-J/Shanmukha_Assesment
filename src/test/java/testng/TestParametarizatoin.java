package testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametarizatoin {

	@Parameters("browser")
	@Test
	public void firstTest(@Optional("safari")String browser) {
		System.out.println(browser);
	}
	
	@Parameters({"username","password"})
	@Test
	public void secondTest(@Optional("shanmukha")String userName,@Optional("heloo@123") String password) {
		System.out.println("username="+userName);
		System.out.println("password="+password);
	}
}
