package pagepackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	// declaration 
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pwd;
	@FindBy(id="loginButton") private WebElement loginbtn;
	@FindBy(name="remember") private WebElement remebercheckbox;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(xpath="//a[@id='licenseLink']") private WebElement licencelink;
	
	
	
	//initialization
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	} 
	
	
	
	
	//utilization
	
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public WebElement getRemebercheckbox() {
		return remebercheckbox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicencelink() {
		return licencelink;
	}
	
	
	
	public void actiTimeValidLogin(String user,String pass)
	{
		usn.sendKeys(user);
		pwd.sendKeys(pass);
		loginbtn.click();
	}
	
	
	public void actiTimeInvalidLogin(String user,String pass)
	{
		usn.sendKeys(user);
		pwd.sendKeys(pass);
		loginbtn.click();
	}
	
	
	

}
