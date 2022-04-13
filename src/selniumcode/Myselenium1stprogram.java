package selniumcode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myselenium1stprogram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://vctcpune.com/");
		Driver.manage().window().maximize();
		Thread.sleep(200);
		Driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(1000);

		Driver.quit();
		
		
	}

}
