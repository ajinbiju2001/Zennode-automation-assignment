package test;

	import java.awt.AWTException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import page.Product_page_fields_test;

	public class Minimumselectiontest
	{
		WebDriver d;
		@BeforeClass
		public void bc()
		{
			d = new ChromeDriver();
			d.get("https://woocommerce-850415-2933260.cloudwaysapps.com/product/rf-id-card");
		}
		
		
		@Test
		public void test() throws AWTException, InterruptedException 
		{
			Product_page_fields_test pf =new Product_page_fields_test(d);
			pf.selecting();
			pf.checkbox("9876543210");
			pf.lb();
			pf.fileupload();
			pf.cart();
		}
		
		@AfterTest
		public void at()
		{
			d.quit();
		}
		
		
}





