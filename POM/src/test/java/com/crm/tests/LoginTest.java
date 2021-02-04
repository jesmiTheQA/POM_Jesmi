package com.crm.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BaseClass;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.Login;

public class LoginTest extends BaseClass{
	
	Login l_obj;
	HomePage homepage_obj;
	
	public LoginTest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		try{
			initialisation();
			l_obj=new Login();
			homepage_obj=new HomePage();
			
		}
		catch(Exception e){
			System.out.println("Error is from setup() "+ e.toString());
		}
	}
	
	@Test
	public void LoginPage(){
		l_obj.PageTytle();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
//		driver.quit();
	}
	

}
