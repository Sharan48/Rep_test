package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generic_Scrennshot {

	public static void getPhoto(WebDriver driver) throws IOException {
		String s = "./photos";
		Date n=new Date();
		String d = n.toString();
		String w = d.replace(":", "-");
		TakesScreenshot t=(TakesScreenshot)driver;
		File p = t.getScreenshotAs(OutputType.FILE);
		File j=new File(s+w+".jpeg");
		FileHandler.copy(p, j);
	}

}

