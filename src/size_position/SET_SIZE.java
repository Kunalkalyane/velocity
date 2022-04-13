package size_position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SET_SIZE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Dimension defaultsize =driver.manage().window().getSize();
		Thread.sleep(2000);
		Dimension d=new Dimension(1000,800);
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());

		
	
		

	}

}
