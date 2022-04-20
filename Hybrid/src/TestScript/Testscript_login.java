package TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.Baseclass;
import Generic.Generic_Excel;
import POMScript.Pom_loginFscrebook;

public class Testscript_login extends Baseclass
{
@Test
 public void test() throws EncryptedDocumentException, IOException
 {
	String user= Generic_Excel.getData("Sheet1", 0, 0);
	String pass= Generic_Excel.getData("Sheet1", 0, 1);
	
	Pom_loginFscrebook fb=new Pom_loginFscrebook(driver);
		fb.username(user);
	    fb.password(pass);
	    fb.login();
	    Assert.fail();
 }
}
