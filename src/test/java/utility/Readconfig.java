package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	
	Properties prop ;
	
	public Readconfig() throws IOException {
		File src= new File(".\\src\\test\\resources\\config");
	
	try 
	(FileInputStream fis = new FileInputStream(src)) {
	    prop=new Properties();
	    prop.load(fis);
	} catch (FileNotFoundException ex) {
		System.out.println("Exception is"  + ex.getMessage() ) ;
	} 
	}
	
	//get the URL from config
	public String getapplicationURL() {
		String url = prop.getProperty("url");
		return url;
	}
	
	//get the URL from config
		public String getbrowser() {
			String browser = prop.getProperty("browser");
			return browser;
		}

		//get the XL from config
				public String getXLpath() {
					String xlpath = prop.getProperty("xlpath ");
					return xlpath ;
				}
}
