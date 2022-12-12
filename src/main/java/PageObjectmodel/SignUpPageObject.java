package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {

	public WebDriver driver;

	By Firstname = By.xpath("//input[@name='UserFirstName']");
	By Lastname = By.xpath("//input[@name='UserLastName']");
	By Workmail = By.xpath("//input[@name='UserEmail']");
	By Jobtitle = By.xpath("//select[@name='UserTitle']");
	By Companyname = By.xpath("//input[@name='CompanyName']");
	By Employees = By.xpath("//select[@name='CompanyEmployees']");
	By PhoneNo = By.xpath("//input[@name='UserPhone']");
	By Countryname = By.xpath("//select[@name='CompanyCountry']");
	By Statename = By.xpath("//select[@name='CompanyState']");
	By Cheakbox = By.xpath("(//div[@class='checkbox-ui'])[1]");

	public SignUpPageObject(WebDriver driver2) {
		this.driver = driver2;
	}

	// To create methods
	public WebElement enterFirstname() {
		return driver.findElement(Firstname);
	}

	public WebElement enterLastname() {
		return driver.findElement(Lastname);
	}

	public WebElement enterWorkmail() {
		return driver.findElement(Workmail);
	}

	public WebElement enterJobtitle() {
		return driver.findElement(Jobtitle);
	}

	public WebElement enterCompanyname() {
		return driver.findElement(Companyname);
	}

	public WebElement enterPhoneNo() {
		return driver.findElement(PhoneNo);

	}

	public WebElement enterCompanyEmployees() {
		return driver.findElement(Employees);

	}

	public WebElement enterCountryname() {
		return driver.findElement(Countryname);
	}

	public WebElement enterStatename() {
		return driver.findElement(Statename);
	}

	public WebElement enterCheakbox() {
		return driver.findElement(Cheakbox);
	}
}
