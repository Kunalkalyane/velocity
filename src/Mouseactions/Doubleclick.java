package Mouseactions;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://vctcpune.com/selenium/practice.html");
		
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement doubleclickbutton=Driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(Driver);
		act.doubleClick(doubleclickbutton).perform();
		act.moveToElement(doubleclickbutton).click().build().perform();

		

	}

}
