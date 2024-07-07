package stepdefination;


import io.cucumber.java.en.Given;
import pageactions.LoginOHRMPA;
import testrunnerlibiary.BaseClass;

public class LoginOHRMStepDef {
	
	LoginOHRMPA lpa=new LoginOHRMPA(BaseClass.getDriver());
	
	
	@Given("^I launch browser \"(.*)\" and nevigate to url \"(.*)\"$")
public void i_launch_browser_and_nevigate_to_url(String choice,String url)
{
		lpa.launchBrowserAndURL(url, choice);
		
}
}

	
	


