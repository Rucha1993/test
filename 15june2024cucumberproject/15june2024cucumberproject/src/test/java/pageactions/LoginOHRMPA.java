package pageactions;

import org.openqa.selenium.WebDriver;

import pageobjects.LoginOHRMPO;
import testrunnerlibiary.BaseClass;

public class LoginOHRMPA extends LoginOHRMPO{

	public LoginOHRMPA(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	static WebDriver driver = BaseClass.getDriver();
	
	public void typeuname(String data) {
		enterDataInElement(uname, data);
		//
	}
	

	public void typepswd(String data)  {
		enterDataInElement(pswd, data);
		//
	}

	public void clickLogin()  {
		clickElement(loginBtn);
	}

}