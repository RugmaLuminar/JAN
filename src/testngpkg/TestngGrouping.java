package testngpkg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngGrouping {
	
	
	
	
	@BeforeTest(alwaysRun = true)
	public void setup()
	{
		System.out.println("browser open");
	}
	
	
	
	
	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups = {"smoke"})
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(groups = {"smoke"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test(groups = {"smoke","sanity"})
	public void test4()
	{
		System.out.println("test4");
	}
	@Test(groups = {"sanity"})
	public void test5()
	{
		System.out.println("test5");
	}
	@Test(groups = {"sanity","regerssion"})
	public void test6()
	{
		System.out.println("test6");
	}
	

}
