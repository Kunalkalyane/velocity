package size_position;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POSITION {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		System.out.println( driver.manage().window().getPosition());
		Point p =new Point(70,90);
		driver.manage().window().setPosition(p);
		
		
		

	}

}
