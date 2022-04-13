package Mouseactions;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Driver.get("https://qavbox.github.io/demo/dragndrop/");
		
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement source=Driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target=Driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(Driver);
		act.dragAndDrop(source, target).perform();
		act.clickAndHold(source).moveToElement(target).release().build().perform();
		

	}

}
