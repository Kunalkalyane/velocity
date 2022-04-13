package geckodriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void Mymethod() throws InterruptedException
	{
		
	

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\geckodriver.exe");
	WebDriver Driver= new FirefoxDriver();
	Driver.get("https://vctcpune.com/selenium/practice.html");
	Driver.manage().window().maximize();
	Thread.sleep(2000);
	}
}
