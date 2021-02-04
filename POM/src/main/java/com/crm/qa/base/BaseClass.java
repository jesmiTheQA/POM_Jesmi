package com.crm.qa.base;

import java.io.FileInputStream;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClass(){
		try{
			
			prop= new Properties();
			FileInputStream filepath=new FileInputStream("D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\POM\\src\\main\\java\\com\\crm\\qa\\config/config.properties");
			prop.load(filepath);
		}
		catch(Exception e){
			System.out.println("Error is from BaseClass() "+e.toString());
		}
	}
	
	public static void initialisation(){
		try{
			String browserName=prop.getProperty("browser");
			if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn\\POM_Help\\chromedriver_win32/chromedriver.exe");
			driver= new ChromeDriver();
			}
			else{
				System.out.println("Invalid browser");
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPILICT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
		}
		catch(Exception e){
			System.out.println("Error is from initialisation()() "+e.toString());
		}
	}

}
