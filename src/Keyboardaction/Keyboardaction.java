package Keyboardaction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardaction {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://www.facebook.com/");

		Driver.manage().window().maximize();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement day =Driver.findElement(By.id("day"));
		Actions act=new Actions(Driver);
		act.click(day).perform();
		Thread.sleep(2000);
		for(int i=0;i<=13;i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(200);

		}
		for(int i=0;i<=10;i++) {
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(200);
		}
		act.sendKeys(Keys.ENTER).perform();
		WebElement firstname=Driver.findElement(By.name("firstname"));
		act.keyDown(firstname,Keys.SHIFT).sendKeys("v").keyUp(Keys.SHIFT).sendKeys("elocity").build().perform();
		

		
	}


		

		
	}
