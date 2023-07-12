package runners;

import org.junit.runner.RunWith;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\SeleniumWorkSpace\\CucumberProject\\src\\test\\java\\features"},//the path of the feature files
		glue={"stepdefinations"}//step Definition Package Name
		)

public class RunnerClass {

}
