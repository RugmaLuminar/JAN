package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Googlesearch {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
	}
	@Test
	public void search()
	{
		WebElement search=driver.findElement(By.name("q"));
		
		search.sendKeys("car",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
	}

}
