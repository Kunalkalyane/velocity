package selniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class popup {
	
	            public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver= new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
				Thread.sleep(2000);
				WebElement cartButton = driver.findElement(By.xpath("//span[text()='Cart']"));
				cartButton.click();
				driver.close();
		}
}


