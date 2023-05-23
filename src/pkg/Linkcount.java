package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Linkcount {
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
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links="+li.size());
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			//System.out.println(link+ "-----"+ s.getText());
			verify(link);
			
			
			
		}	
		
		
	}
	private void verify(String link) {                           // float f1=3.4f;
	                                                              // double d=(double)f1;
		try {
			
			URL u=new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("succesfful response code=200---"+ link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("broken link 404---"+link);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
