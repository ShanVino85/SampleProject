package controllerinterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ControllerIntrface {
	
	
	public void Click(WebDriver driver,WebElement element);
	public void Sendkeys(WebDriver driver,String text);
	
	public void SwitchWindowToChild(WebDriver driver,WebElement element);
	public boolean isSelected(WebDriver driver,WebElement element);
	public boolean isEnabled(WebDriver driver,WebElement element);
	public boolean isDisplayed(WebDriver driver,WebElement element);
	//public void RightClick(WebDriver driver,WebElement element);
	public void alertpopupaYes(WebDriver driver,WebElement element);
	public void alertpopupaNo(WebDriver driver,WebElement element);
	public boolean isAlertPresent(WebDriver driver,WebElement element);
	public void navigateBack() ;
	public void navigateForward();
	public boolean SelectByIndex(WebElement element,String text) ;

}
