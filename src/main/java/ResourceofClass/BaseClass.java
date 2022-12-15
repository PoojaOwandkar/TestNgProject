package ResourceofClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	
	public void broweserlaunching() throws IOException {
		// To Read the Properties File
		String path=System.getProperty("user.dir")+"\\src\\main\\java\\ResourceofClass\\data.properties";
		FileInputStream file=new FileInputStream(path);
				//(System.getProperty("User.dir")+"\\src\\main\\java\\ResourceofClass\\data.properties");
		//("C:\\Users\\SAI\\eclipse-workspace\\Testng19sep22project\\src\\main\\java\\ResourceofClass\\data.properties")
		
    // To Access the properties file
		Properties Prop=new Properties();
    Prop.load(file);
    
   String browserName =Prop.getProperty("browser");
   
   if(browserName.equalsIgnoreCase("Chrome")) {
	   
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAI\\Downloads\\chromedriver_win32\\chromedriver.exe");//to run specific chromedriver
	   //WebDriverManager.chromedriver().setup(); //to run latest
	 driver=new ChromeDriver();
   }
   else if(browserName.equalsIgnoreCase("Firefox")){
	  
   }
   else{
	   
   System.out.println("Please Enter valid browser Name");
   }
	   
   }
   
   @BeforeMethod
   public void launch() throws IOException {
   broweserlaunching();
	 
	
	 driver.get("https://login.salesforce.com/?locale=in");
   
	}

	}
		
	
	
   



