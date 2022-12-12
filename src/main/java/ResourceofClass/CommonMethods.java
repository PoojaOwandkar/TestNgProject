package ResourceofClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	public static void selectDropdown(WebElement dropdown,int index) {
		Select s = new Select(dropdown);
		s.selectByIndex(2);
		
	}
	
	public static void handleAssertion(String actualString,String ExpectedString) {
	SoftAssert assertion=new SoftAssert();
	  String actual =actualString;
	  
			  
	 String Expected = ExpectedString ;
			 
	  assertion.assertEquals(actual, Expected);
	  assertion.assertAll();

}
}
