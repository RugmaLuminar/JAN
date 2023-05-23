package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JD {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Exception
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);
		// driver.get("https://www.facebook.com");
		 driver.manage().window().maximize();
		 //clearbrowsingadata();
	}                                                                                                     
	
	@Test
	public void test1()
	{
	driver.get("https://www.justdial.com");		
	}
	
	public void clearbrowsingadata() throws Exception
	{
		driver.manage().deleteAllCookies();
		driver.get("chrome://settings//clearBrowserData");
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		Thread.sleep(7000);
	}
}
