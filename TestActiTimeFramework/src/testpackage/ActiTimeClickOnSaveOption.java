package testpackage;


import java.io.IOException;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class ActiTimeClickOnSaveOption extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		Flib flib=new Flib();
		
		LoginPage lp=new LoginPage(driver);
		String username=flib.readPropertyFile(PROP_PATH, "username");
		String password=flib.readPropertyFile(PROP_PATH, "password");
		lp.actiTimeValidLogin(username, password);
		HomePage hp=new  HomePage(driver);
		Thread.sleep(3000);
		
		hp.clickSaveLeaveTime();
		Thread.sleep(3000);
		bt.tearDown();
	}

}

