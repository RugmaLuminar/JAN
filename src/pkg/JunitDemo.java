package pkg;

import org.junit.After;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class JunitDemo {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void titleverification()
	{
	String acttitle=	driver.getTitle();
	String exp="google";
	
Assert.assertEquals(acttitle, exp);

//	if(acttitle.equals(exp))
//	{
//		System.out.println("pass");
//	}
//	else
//	{
//		System.out.println("fail");
//	}


		
	}
	@After
	public void tearDown()
	{
		//driver.quit();
	}
	
	

}
