package testrunnerlibiary;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src/test/resources/FeatureFileFolder",
		glue={"stepdefination"},
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						}
		,monochrome = true
				//,publish = true		
)









public class TestRunnerClass {

}
