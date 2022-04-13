package geckodriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Geckodriver {

	@Test
	public void g1()
	{
	

		
		System.setProperty("webdriver.mstedge.driver", "C:\\Users\\DELL\\Desktop\\selenium\\edge bowser\\edgedriver_win64\\edgedriver.exe");
		    		
		    		WebDriver driver = new EdgeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		    	driver.manage().window().maximize();
		    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		    	driver.quit();
		
	}
}
// 2 unix, 1 logical programs,exception handling 2,( dyneshwar 1,suraj sir ),question1 ,selenium 3,=15 days 2weekdays, 

 =15 april 
//

