package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparameter {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		 driver.get("https://www.google.com");
	}
	
	@Parameters("s")
	@Test
	public void main(String s)
	{
		driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
		
	}

}
