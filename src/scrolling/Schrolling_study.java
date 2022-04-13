package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Schrolling_study {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://demoqa.com/alerts");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)Driver;
		js.executeScript("window.scrollBy(0,120)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-70)");

				
				

	}

}
