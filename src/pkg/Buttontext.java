package pkg;

import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class Buttontext {
	WebDriver driver;
	@Before
	public void setUp()
	{
		EdgeOptions op=new EdgeOptions();
		op.addArguments("--remote-allow-origins=*");
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		 driver=new EdgeDriver(op);
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void buttontxt()
	{
		Boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();	
		if(logo)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		
		
		WebElement day=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select dayelement=new Select(day);
		dayelement.selectByVisibleText("01");
		List<WebElement> daylist=dayelement.getOptions();
		
		System.out.println(daylist.size());
		
		WebElement month=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select monthelement=new Select(month);
		monthelement.selectByValue("02");
		
		
		
		
		
		
		
		
		
		
		
		
		WebElement button=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
		String actualbuttontext=button.getAttribute("value");
		String exp="Check availability";
		if(exp.equals(actualbuttontext))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}
