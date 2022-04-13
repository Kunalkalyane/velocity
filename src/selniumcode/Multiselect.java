package selniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		Thread.sleep(200);
		   WebElement multiselectbox=driver.findElement(By.name("cars"));
		  
		   Select s=new Select(multiselectbox);
		   Thread.sleep(200);
		   
		   
		   boolean result=s.isMultiple();
		   System.out.println("Multiple check is"+result);
		   s.selectByVisibleText("Volvo");
		   Thread.sleep(200);
		   s.selectByIndex(2);
		   Thread.sleep(200);
		   s.selectByValue("audi");
		   Thread.sleep(200);
		   s.selectByValue("saab");
		   Thread.sleep(200);
		   s.deselectByVisibleText("Opel");
		   Thread.sleep(200);
		   
		  s.deselectAll();
		  
		   
		   
		   
		   
		
		
		

	}

}
