package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//D:\Ade\Koritademo\BDDDemo2\src\main\resources\features\invcalculator.feature
		features = {"src/main/resources/features/invcalculator.feature"},
		glue = {"stepDefs"},
		monochrome = true,
		plugin = {
				
				"html:target/test-output_1.html",
				"json:target/cucumber-json-report.json"
				
				}
		)

public class testRunner {
}