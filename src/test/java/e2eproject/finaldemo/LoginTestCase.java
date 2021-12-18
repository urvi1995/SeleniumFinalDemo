package e2eproject.finaldemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.HomePageObjects;
import PageObjectModel.LoginPageObject;
import Resourses.BaseClass;

public class LoginTestCase extends BaseClass{
	@Test(dataProvider="getData")
	public void basepagenavigation(String username, String password) throws IOException {
		
		driver= initialisedriver();
		driver.get("http://www.qaclickacademy.com/");
		
		HomePageObjects HPO=new HomePageObjects(driver);
		HPO.clicksignin().click();
		
		LoginPageObject LPO=new LoginPageObject(driver);
		LPO.enterusername().sendKeys(username);
		LPO.enterpassword().sendKeys(password);
		LPO.clicklogin().click();
	}
	
	@DataProvider
	public Object [][] getData(){
		Object[][] data=new Object[2][2];       //two rows two column
		data[0][0]="test@1";
		data[0][1]="urvi123";
	    data[1][0]="test@2";
		data[1][1]="abcd";
		return data;
	}
	

}

