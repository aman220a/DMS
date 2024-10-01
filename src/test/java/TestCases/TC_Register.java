package TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import PageObject.Dashboard;
import PageObject.LoginPage;
import PageObject.RegisterPatients;

public class TC_Register extends Base_class {
	
	
	
	 @Test(priority=0)
	 public void login()
	 {
		

			LoginPage lp = new LoginPage(driver);
			lp.setUsername(username);
			lp.setPassword(password);
			lp.click();
			
			Dashboard hm = new Dashboard(driver);
			hm.clickPatient();
			hm.registerPatient();
			
			
	
	}
	
	
	
	@Test
	public void registerPatient()
	{
		RegisterPatients rp = new RegisterPatients(driver);
		rp.setFirstName("Aman");
		rp.setLastName("Yadav");
		rp.setDOB("10", "12", "1995");
		rp.setAge(30);
		rp.setAddress("Noida");
		rp.setPhone("9140646053");
		rp.setAlignment("Fever");
		rp.setType(2);
		rp.clickButton();
	}

}
