package cucumberoptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/resources/features",
glue="stepdefinitions")


public class TestNGtestrunner extends AbstractTestNGCucumberTests{

}
