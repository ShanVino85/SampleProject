package pageobject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	
	public ProgramPage programPage;
	
	public ClassPage classPage;
	
	
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public ProgramPage getProgramPage() {
		programPage= new ProgramPage(driver);
		return programPage;
	}
	
	public ClassPage getClassPage() {
		classPage= new ClassPage(driver);
		return classPage;
	}
	

}
