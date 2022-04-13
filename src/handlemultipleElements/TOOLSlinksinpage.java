package handlemultipleElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*st*/
public class TOOLSlinksinpage {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(2000);
			
	}		

}
