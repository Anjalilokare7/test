package com.hrms.lib;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class General extends Global {
	/*Stdrule: To provide All re-usable Fun:/methods related to whole Application*/
	 
	public void openApplication()
	{
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("application Opend");
	}
	
	public void closeApplication()
	{
		driver.close();
		System.out.println("Application Closed");
	}
	
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_Password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println(" Login Completed....,,");
	}
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed....");

	}
}
