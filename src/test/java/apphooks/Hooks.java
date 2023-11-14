package apphooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.Testcontextsetup;

public class Hooks {
	
	Testcontextsetup testContextSetup;	

	public Hooks(Testcontextsetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	
	@BeforeMethod
	@Before("@LoginPreCondition")
	public void LogintoLMSPortal() {
		
	}
	
	/*@AfterMethod
	public void AfterScenario() throws IOException {
		//testContextSetup.testBase.WebDriverManager().quit();
		testContextSetup.testBase.getDriver().quit();    
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver =testContextSetup.testBase.getDriver();
		if(scenario.isFailed()) {
			//screenshot
			File sourcepath= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent =FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}*/
	
	
	@AfterMethod
	public void AfterScenario() throws IOException {
		testContextSetup.testBase.WebDriverManager().quit();
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver =testContextSetup.testBase.WebDriverManager();
		if(scenario.isFailed()) {
			//screenshot
			File sourcepath= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent =FileUtils.readFileToByteArray(sourcepath);
			scenario.attach(fileContent, "image/png", "image");
		}
	}

}
