package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/Pavan/workspace/EggTimerCountdownBDD/src/main/java/Features/countdownTimer.feature"
		,glue={"stepDefinitions"}
		,format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome=true
		
		)


public class TestRunner {

}
