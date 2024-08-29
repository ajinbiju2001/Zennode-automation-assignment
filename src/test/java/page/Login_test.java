package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_test 
{
	WebDriver d;
	By username = By.id("username");
	By password =By.id("password");
	By login =By.name("login");
	
	public Login_test(WebDriver d) 
	{
		this.d=d;
	}

	//login test using email and password
	public void logint(String usernamee , String passwordd)
	{
		d.findElement(username).sendKeys(usernamee);
		d.findElement(password).sendKeys(passwordd);
		d.findElement(login).click();
	}

}
