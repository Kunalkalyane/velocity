package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivisonpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.flipkart.com/");
				Driver.manage().window().maximize();
				Thread.sleep(200);
				Driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(200);
			Driver.findElement(By.xpath("//span[text()='Cart']")).click();

					

	}

}
