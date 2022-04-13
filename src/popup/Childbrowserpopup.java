package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://skpatro.github.io/demo/links/");

		Driver.manage().window().maximize();
		Thread.sleep(2000);
		String mainpagewindoid = Driver.getWindowHandle();
		System.out.println();


	}

}
