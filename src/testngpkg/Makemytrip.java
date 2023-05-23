package testngpkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Makemytrip {
	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		 driver.get("https://www.makemytrip.com");
		 driver.manage().window().maximize();
	}                                                                                                     
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String date="Wed May 03 2023";
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]")).click();
		while(true)
		{
		String month=driver.findElement(By.xpath("//*[@class=\"DayPicker-Months\"]/div[1]/div[1]/div")).getText();
		System.out.println(month);
		if(month.equals("June 2023"))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		}
		
		}
		System.out.println("date selection");
		
		
		List<WebElement> date1=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div/div/div/p[1]"));			
		for(WebElement date2:date1)
		{
		String s=date2.getText();
			System.out.println("date="+s);
			if(s.equals("24"))
			{
				date2.click();
			}
			
			
		
		
		
//		WebElement dates=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[2]/div[4]"));
//		String text=dates.getText();
//		String arialabel=dates.getAttribute("aria-label");
//
//		System.out.println("got list"+text);
//		System.out.println("area label="+arialabel);
//		
//		dates.click();
//List<WebElement> date1=driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div/div"));


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		for(WebElement date1:dates)
//		{
//			System.out.println(date1);
//			String d=date1.getAttribute("aria-label");
//			System.out.println(d);
//		if(d.equals("4"))
//		{
//			date1.click();
//		}
//			
//		}
		
		
		
	}
	}
	

}
