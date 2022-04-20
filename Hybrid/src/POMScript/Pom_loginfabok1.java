package POMScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Basepage;

public class Pom_loginfabok1 extends Basepage
{

	@FindBy(id="email")
	private WebElement use;
	
	@FindBy(id="pass")
	private WebElement psw;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btn;
	
	@FindBy(xpath="(//input[@type='search'])[1]")
	private WebElement srg;
	
	@FindBy(xpath="(//a[.='Sachin Sultanpur'])[6]")
	private WebElement sh;
	
	@FindBy(xpath="(//span[.='Add Friend'])[1]")
	private WebElement frnd;
	
	@FindBy(xpath="//div[@aria-label='Account']")
	private WebElement acc;
	
	@FindBy(xpath="//span[.='Log Out']")
	private WebElement lgt;
	
	
	public Pom_loginfabok1(WebDriver driver)
	{
		super(driver);
	}
	
	public void username(String user)
	{
		use.sendKeys(user);
	}
	public void password(String pass)
	{
		psw.sendKeys(pass);
	}
	public void login()
	{
		btn.click();
	}
	
	public void search(String serh)
	{
		srg.sendKeys(serh);
		srg.submit();
	}
	
	public void sachin()
	{
		sh.click();
	}
	public void friend()
	{
		frnd.click();
	}
	public void account()
	{
		acc.click();
	}
	public void logout()
	{
		lgt.click();
	}
}
