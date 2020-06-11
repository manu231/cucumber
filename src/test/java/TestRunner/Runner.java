package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "C:\\Users\\chill\\cucumber\\automation\\src\\test\\java\\Feature\\log.feature",
  glue = {"StepDefinition"}
		
		)
public class Runner {

}
