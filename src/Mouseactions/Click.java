package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		

	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver Driver= new ChromeDriver();
	Driver.get("https://vctcpune.com/selenium/practice.html");
	
	Driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement checkBoxOption1 = Driver.findElement(By.id("checkBoxOption1"));
	JavascriptExecutor js=(JavascriptExecutor)Driver;
	js.executeScript("arguments[0].scrollIntoView();",checkBoxOption1);
	Thread.sleep(2000);
	checkBoxOption1.click();
	Actions act=new Actions(Driver);
	act.click(checkBoxOption1).perform();
	act.moveToElement(checkBoxOption1).click().build().perform();
	
	

	

}
}
