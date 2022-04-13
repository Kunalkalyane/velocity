package waitOrSynchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaituse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); this used for older version
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		
	}

}
