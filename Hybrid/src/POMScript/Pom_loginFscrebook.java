package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Baseclass;
import Generic.Basepage;
import net.bytebuddy.implementation.bind.annotation.Super;

public class Pom_loginFscrebook extends Basepage {
	
	@FindBy(id="email")
	private WebElement use;
	
	@FindBy(id="pass")
	private WebElement pasw;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement lgn;
	
	
	public Pom_loginFscrebook(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void username(String user)
	{
		use.sendKeys(user);
	}
	
	public void password(String pass)
	{
		pasw.sendKeys(pass);
	}
	
	public void login()
	{
		lgn.click();
	}
}
