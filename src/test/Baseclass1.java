package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass1 {
	
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	 driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		
	}

}
