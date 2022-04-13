package KitePoMTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageforTestNG {
	@FindBy(xpath="//span[@class='user-id')")private WebElement UserID;
	@FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;
	

	public HomePageforTestNG(WebDriver driver) {
		
	PageFactory.initElements(driver,this);
}
	
public String getActualUserID()
{
	String ActualUserID=UserID.getText();
return ActualUserID;
}
	/*	if(ActualUserID.equals (ExpectedUSerID)) {
		System.out.println("USER ID MATCH tc is PASSED");
	}
	else
	{
		System.out.println("USER ID IS NOT MATCHED tc is Failed");
	}
}*/
public void logoutButton() throws InterruptedException
{
	UserID.click();
	Thread.sleep(2000);
	logoutButton.click();
	
}
}
