package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Copypaste {
	WebDriver driver;
	@Test
	public void copy()
	{
		
		
		WebElement fullname=driver.findElement(By.xpath(""));
		WebElement rediffid=driver.findElement(By.xpath(""));
		fullname.sendKeys("abc");
		Actions act=new Actions(driver);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
		
	}

}
