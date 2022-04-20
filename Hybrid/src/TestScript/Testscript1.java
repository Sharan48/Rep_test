package TestScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic.Baseclass1;
import Generic.Generic_Excel;
import POMScript.Pom_loginfabok1;

public class Testscript1 extends Baseclass1
{
	@Test

	public void test() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String user = Generic_Excel.getData("Sheet1", 0, 0);
		String pass = Generic_Excel.getData("Sheet1", 0, 1);
		String serh = Generic_Excel.getData("Sheet1", 0, 2);

		Pom_loginfabok1 d=new Pom_loginfabok1(driver);
		d.username(user);
		d.password(pass);
		d.login();
		WebDriverWait n=new WebDriverWait(driver, 20);
		n.until(ExpectedConditions.titleContains("Facebook"));
		d.search(serh);
		d.sachin();
		d.friend();
		d.account();
		d.logout();
	}
}

