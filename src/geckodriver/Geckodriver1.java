package geckodriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geckodriver1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "");
		WebDriver Driver= new FirefoxDriver();
		Driver.get("https://vctcpune.com/selenium/practice.html");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
	}

}
