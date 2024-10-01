package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPatients {

	WebDriver ldriver;
	

	public RegisterPatients(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(name="pat_fname")
	WebElement firstname;
	
	@FindBy(name="pat_lname")
	WebElement lastname;
	
	@FindBy(name="pat_dob")
	WebElement dob;
	
	@FindBy(name="pat_age")
	WebElement age;
	
	@FindBy(name ="pat_addr")
	WebElement address;
	
	@FindBy(name="pat_phone")
	WebElement phone;
	
	@FindBy(name="pat_ailment")
	WebElement ailgment;
	
	@FindBy(name="pat_type")
	WebElement type;
	
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[3]/div/div/div[2]/div/div/div/form/button/span[1]")
	WebElement button;
	
	public void setFirstName(String ename)
	{
		firstname.sendKeys(ename);
	}
	
	public void setLastName(String elast)
	{
		lastname.sendKeys(elast);
	}
	
	public void setDOB(String dd,String mm,String yy)
	{
		dob.sendKeys(dd);
		dob.sendKeys(mm);
		dob.sendKeys(yy);
		
	}
	
	public void setAge(int x)
	{
		age.sendKeys(String.valueOf(x));
	}
	
	public void setAddress(String add)
	{
		address.sendKeys(add);
	}
	
	public void setPhone(String number)
	{
		phone.sendKeys(number);
	}
	
	public void setAlignment(String type)
	{
		ailgment.sendKeys(type);
	}
	
	public void setType(int a)
	{
		Select st = new Select(type);
		st.selectByIndex(a);
	}
	
	public void clickButton()
	{
		button.click();
	}
	
	
}
