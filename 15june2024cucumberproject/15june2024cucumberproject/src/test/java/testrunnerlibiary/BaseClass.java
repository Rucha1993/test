package testrunnerlibiary;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class BaseClass extends TestRunnerClass {
	
	static WebDriver driver;

	public BaseClass(WebDriver _driver) {
		driver = _driver;
	}

	public void launchBrowserAndURL(String URL, String choice) {

		if (choice.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			driver.navigate().to(URL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public void tearDown() {
		driver.quit();
	}


}