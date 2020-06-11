package com.hrms.testcases;

import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;



public class LoginTest extends CommonMethods {

//	@BeforeMethod
//	public void openBrowserAndNavigate() {
//		setUp();
//		initialize();
//	}
//
//	@AfterMethod
//	public void quitBrowser() {
//		tearDown();
//	}
	
	@Test(groups = "smoke")
	public void validAdminLogin() {
		//LoginPageElements login = new LoginPageElements();
		test.info("Entering valid login credentials");
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		//DashboardPageElements dashboard = new DashboardPageElements();
		test.info("Verifying valid username shows with welcome text");
		String expectedUser = "Welcome Admin";
		String actualUser = dashboard.welcome.getText();
		Assert.assertEquals(actualUser, expectedUser, "Admin is not logged in");
	}
	
	@Test(groups = "regression")
	public void invalidPasswordLogin() {
		//LoginPageElements login = new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "uiuiuig");
		click(login.loginBtn);
		
		String expected = "Invalid credentials";
		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text does not match");
	}
	
	@Test(groups = "regression")
	public void emptyUsernameLogin() {
		//LoginPageElements login = new LoginPageElements();
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		String expected = "Username cannot be empty";
		Assert.assertEquals(login.errorMsg.getText(), expected, "Error message text does not match");
	}
	
	@Test
	public void timeStamp() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		sdf.format(d.getTime());
	}
	
	
	
}
