package selniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mumbai");
		Driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mum@123");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//button[@name='login']")).click();

		
		
		
	
		
		
	
		
		

	}

}
