package pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pagesrcpgm {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
	String src=	driver.getPageSource();//return sourcecode
	if(src.contains("Gmail"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}

	}

}
