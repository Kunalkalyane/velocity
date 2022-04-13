package selniumcode;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		
		File dest=new File("C:\\Users\\DELL\\Desktop\\selenium\\Screens");
		FileHandler.copy(source, dest);
		
	
	}

}
