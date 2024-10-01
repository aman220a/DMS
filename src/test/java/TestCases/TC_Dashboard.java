package TestCases;

import org.testng.annotations.Test;

import PageObject.Dashboard;

import PageObject.LoginPage;

public class TC_Dashboard extends Base_class {

			
		@Test
		public void loginTest1()
		{
			
			LoginPage lp = new LoginPage(driver);
			lp.setUsername(username);
			lp.setPassword(password);
			lp.click();
			
			Dashboard hm = new Dashboard(driver);
			hm.clickPatient();
			hm.registerPatient();
			
			
		}

	}

	

