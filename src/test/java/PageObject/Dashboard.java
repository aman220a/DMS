package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
WebDriver ldriver;
	

public Dashboard(WebDriver rdriver)
{
	ldriver = rdriver;
	PageFactory.initElements(rdriver,this);
}
	
	@FindBy(xpath="//*[@id=\"side-menu\"]/li[3]/a")
	WebElement Patient;
	
	
	@FindBy(xpath="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement Register;
	
	public void clickPatient()
	{
		Patient.click();
	}
	
	public void registerPatient()
	{
		Register.click();
	}	

}
