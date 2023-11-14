package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/java/features",

//glue="stepdefinitions",tags="@mobiletest or @webtest")

glue="stepdefinitions",tags="@portaltest")*/


@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/features",



glue="stepdefinitions")
public class TestRunner {
	
	

}
