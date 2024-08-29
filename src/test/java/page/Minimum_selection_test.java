package page;

	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.awt.event.KeyEvent;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

public class Minimum_selection_test 
	{
	WebDriver d;
	By variation_color = By.xpath("//*[@id=\"product-145\"]/div[3]/form/table/tbody/tr[1]/td/div/ul/li[1]/span");
	By variation_orientation = By.xpath("//*[@id=\"product-145\"]/div[3]/form/table/tbody/tr[2]/td/div/ul/li[2]/span");
	By Profile_Description = By.name("profile_desc");
	By check_box = By.xpath("//*[@id=\"phone_number_checkbox\"]");
	By phonenumber_field =By.id("phone_number_field");
	By idd = By.id("type");
	By logo = By.xpath("//*[@id=\"product-145\"]/div[3]/form/div/div[2]/div[2]/div[3]/div[2]/div[1]/label/div/img");
	By boarder_double = By.xpath("//*[@id=\"product-145\"]/div[3]/form/div/div[2]/div[2]/div[3]/div[2]/div[3]/label/div/img");
	By boarder_dashdotted = By.xpath("/html/body/div[1]/div/main/div/div/div/article/div[2]/div[3]/form/div/div[2]/div[2]/div[3]/div[2]/div[4]/label/div/img");
	By upload_logo = By.xpath("//*[@id=\"logo\"]");
	By add_cart = By.xpath("//*[@id=\"product-145\"]/div[3]/form/div/div[2]/button");



public Minimum_selection_test (WebDriver d2) 
	{
		this.d=d2;
	}

	//choosing variations colour=red, orientation=landscape & adding description
public void selecting()
	{
		WebElement aa= d.findElement(variation_color);			
		WebElement bb=d.findElement(variation_orientation);
		Actions ac = new Actions(d);
		ac.click(aa);
		ac.click(bb);
		ac.perform();
		WebElement cc= d.findElement(Profile_Description);
		ac.click(cc);
		cc.sendKeys("description for testing hai heloo"); //adding description
	}

	//clicking checkbox,entering phonenumber and selecting id as premium
public void checkbox(String phonenumber)
	{
		d.findElement(check_box).click();
		d.findElement(phonenumber_field).sendKeys(phonenumber);
		WebElement id_s = d.findElement(idd);
		Select s = new Select(id_s);
		s.selectByIndex(1);
	}

	//selecting logo&boarder
public void lb()
	{
		d.findElement(logo).click();
		d.findElement(boarder_dashdotted).click();
	}

	//logo uploading
public void fileupload() throws AWTException, InterruptedException
	{
		
		WebElement z=	d.findElement(By.name("logo"));
		Actions act = new Actions(d);
		act.click(z);
		act.perform();
		fileupload("C:\\Users\\AJIN\\OneDrive\\Pictures\\zennode.png");
	}

public void fileupload(String st) throws AWTException, InterruptedException 
	{
	try
		{
		Product_page_fields_test pt = new Product_page_fields_test(d);
		StringSelection strslct=new StringSelection(st);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strslct, null);
		Thread.sleep(2000);
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);	
	    Thread.sleep(2000);
		}
	catch(Exception ee)
		{
			System.out.println(ee);
		}
		
	}
	//selecting border
public void selectborder()
	{
		d.findElement(boarder_double).click();
	}

	//add to card
public void cart()
	{
		d.findElement(add_cart).click();
	}

		

}




