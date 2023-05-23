package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	
//	@beforesuite
//	@beforeclass
//	@beforetest
//	@beforemethod
//	@test
//	@aftermethod
//	@aftertest
//	@afterclass
//	@aftersuite
	
	@BeforeTest
	public void setup()
	{
		//browser open
	}
	@BeforeMethod
	public void urlloading()
	{
		//url load
	}
	@Test(priority=2,dependsOnMethods = {"test2"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority = 1,invocationCount = 3)
	public void test2()
	{
		System.out.println("test2");
	}
	@AfterMethod
	public void mtd()
	{
		System.out.println("aftermethod");
	}
	
	
	
	

}
