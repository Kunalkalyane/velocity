package KiteappusingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	@FindBy(xpath="//span[@class='user-id')")private WebElement USerID;
	@FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;
	

	public KiteHomePage(WebDriver driver) {
		
	PageFactory.initElements(driver,this);
}
	
public void validateuserID(String Userid)
{
	String ActualUserID=USerID.getText();
	String ExpectedUSerID=Userid;
	if(ActualUserID.equals (ExpectedUSerID)) {
		System.out.println("USER ID MATCH tc is PASSED");
	}
	else
	{
		System.out.println("USER ID IS NOT MATCHED tc is Failed");
	}
}
public void logoutButton() throws InterruptedException
{
	USerID.click();
	Thread.sleep(2000);
	logoutButton.click();
	
}
}
 