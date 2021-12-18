package Resourses;
//just changes for git learning
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	
	public WebDriver initialisedriver() throws IOException {
		
	
     Properties prop=new Properties();
     
     FileInputStream fis = new FileInputStream(
    		 "C:\\Users\\SAI\\eclipse-workspace\\finaldemo\\src\\main\\java\\Resourses\\Data.properties");
     prop.load(fis);
     
    String Browsername= prop.getProperty("Browser");
     if (Browsername.equals("chrome")) {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAI\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
 		 driver =new ChromeDriver();
     }
     
     else if(Browsername.equals("firefox")){
    	 //firefox code
     }
     else {
    	 //ie internal explorer code
     }
     return driver;
}
}