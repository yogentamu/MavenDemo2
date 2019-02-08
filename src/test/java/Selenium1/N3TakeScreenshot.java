package Selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class N3TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver yogen=new ChromeDriver();
	
		yogen.navigate().to("https://www.Amazon.com");
		yogen.manage().window().fullscreen();
		yogen.manage().deleteAllCookies();
		
		//two lines of code -convert screenshot interface to driver than use get method.
		 File screenshotFile = ((TakesScreenshot) yogen).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile,new File ("/Users/bhakta/Downloads/Screenshot/naveen.png"));
	
		yogen.close();
	}

}
