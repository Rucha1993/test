package commonmethodlibiary;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods extends testrunnerlibiary.BaseClass {

	static WebDriver driver = testrunnerlibiary.BaseClass.getDriver();
	static WebElement element;
	
	public CommonMethods(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickElement(By reference) 
	{
		element = getDriver().findElement(reference);
		element.click();
	}
	
	public void enterDataInElement(By reference,String data) 
	{
		element = getDriver().findElement(reference);
		element.sendKeys(data);
	}
	
	

	public boolean checkIfElementDisplayed(By reference) {

		boolean val = false;

		try {

			if (getDriver().findElement(reference).isDisplayed()) {
				val = true;
			} else {
				val = false;
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element is not present, hence not displayed as well");
		}
		return val;
	}

}