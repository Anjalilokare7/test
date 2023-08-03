package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//Stdrule:To provide TestData & Objects relate to whole application
	
	//***TestData***
	public String url =  "http://183.82.103.245/nareshit/login.php";
	public String un  =  "nareshit";
	public String pw  =  "nareshit";
	
	//***Objects/Element***
	public String txt_loginname = "txtUserName";
	public String txt_Password  = "txtPassword";
	public String btn_login     = "Submit";
	public String link_logout   = "Logout";

}
