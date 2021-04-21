package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Features", glue= {"stepdefination"}, plugin= {"html:target/html-report"})
public class TestRunner {

}
