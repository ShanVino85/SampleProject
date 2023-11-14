package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Logger;
import utility.Readconfig;

//import dsutilities.LoggerLoad;

public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
      static Readconfig readconfig=new Readconfig();
	public static String baseURL=readconfig.getapplicationURL();
	public static String browserName=readconfig.getbrowser();
	
	
	public WebDriver WebDriverManager() throws IOException {
  //public static void Initialization() {
		ChromeOptions options=new ChromeOptions ();
		options.addArguments("headless");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
		}
		
		if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver(options);
		}
		
		if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new ChromeDriver(options);
		}

	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	Logger.info("<---------------Starting the Browser-------------->");
	driver.get(prop.getProperty("url"));
	return driver;
	
	
		
	}
  
     public static void tesrdown() {
	driver.close();
     }

}


