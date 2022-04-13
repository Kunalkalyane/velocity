package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://skpatro.github.io/demo/links/");
				Driver.manage().window().maximize();
				Thread.sleep(2000);
				String mainpageid=Driver.getWindowHandle();
				System.out.println(mainpageid);	
			Driver.findElement(By.name("NewWindow")).click();
			Set<String>allwindowsids=Driver.getWindowHandles();
			System.out.println(allwindowsids);
			Iterator<String>it=allwindowsids.iterator();
			String mainpageid0=it.next();
			String childpageid1=it.next();
			Thread.sleep(2000);
			Driver.switchTo().window(childpageid1);
			Driver.manage().window().maximize();
			Thread.sleep(2000);
			Driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("SELENIUM");
			Thread.sleep(3000);
			Driver.close();
			Driver.switchTo().window(mainpageid0);
			Thread.sleep(2000);
			Driver.findElement(By.name("home")).click();
			Driver.close();

			

			

			


			
			

			
			
			
			


	}

}
