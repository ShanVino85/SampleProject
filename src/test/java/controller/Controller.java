package controller;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import baseclass.Baseclass;
import controllerinterface.ControllerIntrface;

public class Controller extends Baseclass implements ControllerIntrface {
	
	public WebDriver driver;
	Actions action=new Actions(driver);
	Select select;
	
	
	
	@Override
	public void Click(WebDriver driver,WebElement element) {
		 try {
		    	
		        action.moveToElement(element).click().build().perform();
		    } catch (Exception e) {
		        // Handle the exception here
		        System.out.println("An error occurred while clicking: " + e.getMessage());
		        e.printStackTrace();
		      }
	}
		   
	@Override
	        public void SwitchWindowToChild() {
				// Parent -child window handler
				Set<String> s1= driver.getWindowHandles();
				Iterator<String> i1=s1.iterator();
				String parentWindow = i1.next();
				String childWindow = i1.next();
				driver.switchTo().window(childWindow);
			}
	@Override 
	        public boolean isAlertPresent() 
	    	{ 
	    	    try 
	    	    { 
	    	        driver.switchTo().alert(); 
	    	        return true; 
	    	    }   // try 
	    	    catch (NoAlertPresentException Ex) 
	    	    { 
	    	        return false; 
	    	    }   // catch 
	    	}   // isAlertPresent()
	        
	@Override 
	        public void alertpopupayes() {
	        	
	    		Alert alert = driver.switchTo().alert(); // switch to alert
	    		alert.accept();
	    		

	    		String alertMessage= driver.switchTo().alert().getText(); // capture alert message

	    				alert.accept();
	    	}
	@Override
	    	public void alertpopupano() {
	    	
	    	Alert alert = driver.switchTo().alert(); // switch to alert
	    	alert.accept();
	    	

	    	String alertMessage= driver.switchTo().alert().getText(); // capture alert message

	    			alert.dismiss();
	    	}
	    	
	@Override    	
	public void navigateBack() {
	   		 
	  		  driver.navigate().back();
	  		   	  	  
	  		  }
	  	
	@Override  
	public void navigateForward() {
	  		 
	  		  driver.navigate().forward();
	  		 		  	  
	  		  }
	  	
	@Override  	
	public  boolean isDisplayed(WebElement element) 
		{
			boolean value;
			try 
			{
				value=element.isDisplayed();
				return value;
			}
			catch (Exception e)
			{
				return false;
			}		
		}
	  	
	@Override  	
	public boolean isSelected(WebElement element) {
	  	    try {
	  	        return element.isSelected();
	  	    } catch (NoSuchElementException e) {
	  	        // Handle the case where the element is not found on the page
	  	        System.out.println("Element not Selected : " + e.getMessage());
	  	        return false; // You can choose to return false or throw the exception as needed
	  	    } catch (Exception e) {
	  	        // Handle any other exceptions that might occur
	  	        System.out.println("An error occurred while checking element Selection: " + e.getMessage());
	  	        e.printStackTrace();
	  	        return false; // You can choose to return false or throw the exception as needed
	  	    }
	  	}
	  	
	@Override  
	public boolean isEnabled(WebElement element,String text) 
		{
			boolean flag=false;
			try 
			{
				
				if(element.isEnabled()) {
					flag=true;
					System.out.println("Element is enabled");
					}
				else {
					flag=false;
					System.out.println("Element is not enabled");
				}
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			return flag;
		}
	  	
	  	
	  	
	@Override 
	  	public boolean Sendkeys(WebElement element,String text) 
		{
			boolean flag=false;
			try 
			{
				
				if(element.isDisplayed()) {
					element.clear();
					element.sendKeys(text);
					flag=true;
					System.out.println("Successfully entered value");
					}
				else {
					flag=false;
					System.out.println("Unable to enter value");
				}
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			return flag;
		}
	@Override 
	  	public boolean SelectByIndex(WebElement element,int index) 
		{
			boolean flag=false;
			try 
			{
				if(element.isDisplayed()) {
					select=new Select(element);
					select.selectByIndex(index);
					flag=true;
					System.out.println("Successfully entered value");
					}
				else {
					flag=false;
					System.out.println("Unable to enter value");
				}
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			return flag;
		}

	
}
