package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest extends Baseclass1{
	

	
	@Test
	public void fblogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc123");
		ob.login();
		
		
		
	}
	

}
