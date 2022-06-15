package generic;

import java.io.IOException;
import java.time.Duration;

import org.checkerframework.common.util.report.qual.ReportCall;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest implements IAutoConstant
{
	
	
	protected static WebDriver driver;
	

	public void setUp() throws IOException
	{
		
		
		
		Flib flib=new Flib();
		String browserValue = flib.readPropertyFile(PROP_PATH, "browser");
		String url=flib.readPropertyFile(PROP_PATH, "url");
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
			
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get(url);
		}
		else
		{
			//Reporter.log("",true);
		}
	}
	
	
	public static void tearDown()
	{
		
		
			driver.quit();
		
	}
	
	public static void failed()
	{
		
	}
	
	

}
