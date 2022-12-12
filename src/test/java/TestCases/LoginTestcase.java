package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectmodel.LoginPageObject;
import ResourceofClass.BaseClass;
import ResourceofClass.CommonMethods;
import ResourceofClass.Constant;

public class LoginTestcase extends BaseClass {
	
private static final WebElement Errormsg = null;

@Test
	public void login() throws IOException {
		
	
	 
	  // driver.findelkement(By.xpath("//input[@id='username']")).sendkeys("hello");
	 
	 LoginPageObject LPO= new LoginPageObject(driver);
	  
	  LPO.enterUsername().sendKeys(Constant.Username);
	  LPO.enterPassword().sendKeys(Constant.Password);
	  LPO.clickOnLogin().click();
	  LPO.enterErrormsg().getText();
	  
	  CommonMethods.handleAssertion(LPO.enterErrormsg().getText(), Constant.Errormsg );
	  
	 /* SoftAssert assertion=new SoftAssert(); all remove comment
	  String actual =LPO.enterErrormsg().getText(); 
	  
			  
	 String Expected = Constant.Errormsg; 
			 
	  assertion.assertEquals(actual, Expected);
	  assertion.assertAll();*/

}


		
	}
