package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertpgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		driver.get("file:///E:/Rugma/selenium%20notes/alert.html");
	}
	@Test
	public void buttontxt()
	{
		
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
