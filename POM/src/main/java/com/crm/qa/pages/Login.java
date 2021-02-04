package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.crm.qa.base.BaseClass;

public class Login extends BaseClass {
	
	//PageFactory - OR(Object Repository)
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement username;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement LoginButton;
	
	public Login(){
		PageFactory.initElements(driver, this);
	}
	
	public void PageTytle(){
		String s=driver.getTitle();
		System.out.println(s);
//		Assert.assertEquals(s, "Sh");
	}

	public HomePage Login(String u,String p){
		username.sendKeys(u);
		password.sendKeys(p);
		LoginButton.click();
		return new HomePage();
	}
}
