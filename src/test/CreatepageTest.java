package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import page.Createpage;

public class CreatepageTest extends Baseclass1 {
	

	
	@Test
	public void createpagettest()
	{
		Createpage page=new Createpage(driver);
		page.createpageclick();
		page.getstartedclick();
	}
	
	
	

}
