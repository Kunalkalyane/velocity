package SerailAndParallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SerailAndParallel2 {
 

	  @Test
	  public void Mymethod1() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
			}
}