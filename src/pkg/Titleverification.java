package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Titleverification {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String exptitle="Google.com";
		String actualtitle=driver.getTitle();//actual title of the site
		System.out.println(actualtitle);
		if(exptitle.equals(actualtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
