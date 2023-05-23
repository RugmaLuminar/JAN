package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehover {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		 driver.get("https://www.ebay.com");
		 driver.manage().window().maximize();
		 
		 //navigation commands
		 // driver.navigate().back();
//		    driver.navigate().refresh();
//		    driver.navigate().forward();
//		    driver.navigate().to("");
		 
		 
		 
		 
	}
	
	@Test
	public void ebay()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement electronics=	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	Actions act=new Actions(driver);
	act.moveToElement(electronics);
	act.perform();
	driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
	
		
	}

}
