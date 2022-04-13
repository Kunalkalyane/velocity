package selniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LISTBOX {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver Driver= new ChromeDriver();
		Driver.get("https://vctcpune.com/selenium/practice.html");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement Dropdown=Driver.findElement(By.name("dropdown-class-example"));
		Select s= new Select(Dropdown);
		s.selectByVisibleText("Option3");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("option1");
		Thread.sleep(2000);
		System.out.println("is multiple state is "+s.isMultiple());
		
		
		

		

	}

}
