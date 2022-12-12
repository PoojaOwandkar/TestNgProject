package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectmodel.LoginPageObject;
import PageObjectmodel.SignUpPageObject;
import ResourceofClass.BaseClass;
import ResourceofClass.CommonMethods;
import ResourceofClass.Constant;

public class SignupTestcase extends BaseClass {

	@Test
	public void verifysignup() throws IOException, InterruptedException {
		//broweserlaunching();

		//driver.get("https://login.salesforce.com/?locale=in");  remove 

		LoginPageObject LPO = new LoginPageObject(driver);

		LPO.clickOnTryForFree().click();

		SignUpPageObject SPO = new SignUpPageObject(driver);

		Thread.sleep(2000);
		SPO.enterFirstname().sendKeys(Constant.Firstname);
		SPO.enterLastname().sendKeys(Constant.Lastname);
		SPO.enterWorkmail().sendKeys(Constant.Workmail);
		
        CommonMethods.selectDropdown(SPO.enterJobtitle(), 2);
		Select s = new Select(SPO.enterJobtitle());//remove
		s.selectByIndex(2);//remove
		
		CommonMethods.selectDropdown(SPO.enterCompanyEmployees(), 1);

		SPO.enterCompanyname().sendKeys(Constant.Companyname);

		Select s1 = new Select(SPO.enterCompanyEmployees());// remove
		s1.selectByIndex(1);//remove

		SPO.enterPhoneNo().sendKeys(String.valueOf(123456789));
		SPO.enterCountryname().sendKeys(Constant.Countryname);
		SPO.enterStatename().sendKeys(Constant.Statename);
		SPO.enterCheakbox().click();
	}

}
