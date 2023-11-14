package utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import baseclass.Baseclass;
import pageobject.PageObjectManager;
//import utilities.GenericUtils;


public class Testcontextsetup {
	
	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public Baseclass testBase;
	//public GenericUtils genericUtils;
	
	public Testcontextsetup() throws IOException{
		testBase = new Baseclass ();
		pageObjectManager = new PageObjectManager(Baseclass.driver);
	//	genericUtils = new GenericUtils(testBase.WebDriverManager());
		
	}
	


}
