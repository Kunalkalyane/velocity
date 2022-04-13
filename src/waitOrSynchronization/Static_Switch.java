package waitOrSynchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Switch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		

	}

}
