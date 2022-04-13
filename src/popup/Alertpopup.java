package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");

				driver.manage().window().maximize();
				Thread.sleep(200);
			WebElement clickmebutton=driver.findElement(By.id("confirmButton"));
			clickmebutton.click();
			Alert alt=driver.switchTo().alert();
			String textonalertpopup=alt.getText();
			System.out.println("text on alert popup"+textonalertpopup);
			alt.accept();
			
				
				
	}

}
