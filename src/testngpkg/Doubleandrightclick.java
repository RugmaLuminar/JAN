package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Doubleandrightclick {
	WebDriver driver;
	
	
	
	
	@Test
	public void test()
	{
		WebElement doubleclick=driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick);
		act.perform();
		driver.switchTo().alert().accept();
		
		WebElement right=driver.findElement(By.xpath(""));
		act.contextClick(right);
		act.perform();
		driver.switchTo().alert().accept();
		
		
	}

}
