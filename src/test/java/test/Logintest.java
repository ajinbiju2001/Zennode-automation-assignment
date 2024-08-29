package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.Login_test;

public class Logintest 
{
	WebDriver d;
	@BeforeClass
	public void bc()
	{
		d=new ChromeDriver();
		d.get("https://woocommerce-850415-2933260.cloudwaysapps.com/my-account");
	}
	@Test
	public void test1()
	{
		Login_test l = new Login_test(d);
		l.logint("test_customer", "password");
	}
	@AfterTest
	public void at()
	{
		d.quit();
	}

}
