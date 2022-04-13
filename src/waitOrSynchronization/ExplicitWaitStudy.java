package waitOrSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); this used for older version
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement SignInButton = driver.findElement(By.xpath("//*[@id=\"#signIn\"]/h6"));
		SignInButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		driver.findElement(By.id("mobilenumber")).sendKeys("9999999999");
		WebElement getOtpButton = driver.findElement(By.xpath("//button[@type='submit']"));
		WebDriverWait w=new WebDriverWait(driver,Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(getOtpButton));
		getOtpButton.click();
		
		
		
	}
	

}
