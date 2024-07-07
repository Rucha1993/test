package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import commonmethodlibiary.CommonMethods;
import testrunnerlibiary.BaseClass;

public class LoginOHRMPO extends CommonMethods {

	public LoginOHRMPO(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}

	static WebDriver driver = BaseClass.getDriver();

	
	public By uname = By.xpath("//input[@name='username']"); 
	public By pswd = By.xpath("//input[@type='password']");
	public By loginBtn = By.xpath("//button[@type='submit']");

}