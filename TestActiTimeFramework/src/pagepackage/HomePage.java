package pagepackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	
	//declaration
	
	@FindBy(xpath="//a[.='Logout']") private WebElement logout;
	@FindBy(xpath="//div[.='Settings']") private WebElement settings;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement newTask;
	@FindBy(id="SubmitTTButton") private WebElement submit;
	
	
	//initialization
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//utilization
	
	public WebElement getLogout() {
		return logout;
	}

	public WebElement getSettings() {
		return settings;
	} 
	public WebElement getNewTask() {
		return newTask;
	}
	
	
	//generic reusable method
	
	
	
	
	//operational methods
	
	
	
	public void clickLogout()
	{
		logout.click();
	}
	
	public void clickSaveLeaveTime()
	{
		submit.click();
	}

}
