package sample1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Class1 {
	@FindBy(xpath="//span[contains(text(),'Logout')]")
	WebElement logout;
	
	public logout()
	 {
		 PageFactory.initElements(driver,this);
	 }

	public void close() {
		logout.click();
		
	}
	
	    
	}


