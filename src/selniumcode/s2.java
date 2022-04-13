package selniumcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://vctcpune.com/selenium/practice.html");
		Driver.manage().window().maximize();
		Thread.sleep(2000);
		
		/*Driver.findElement( By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("dell laptops");
		Thread.sleep(2000);
		Driver.findElement( By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
*/

		//Driver.findElement(By.xpath("//a{text()='Forgotten password']")).click();
		//Driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		//Driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]")).click();
		//Driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("pune@1234");
		Driver.findElement(By.xpath("//input[contains(@type,'radio')][2]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//input[contains(@type,'radio')][3]")).click();

		
		
		
	
	}

}
