package KitePoMTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinpageforTestNG {
	@FindBy(id="pin")private WebElement PINID;
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	
	public PinpageforTestNG(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Enterpin(String PIN)
	{
		PINID.sendKeys(PIN);
	}
	public void clickoncontinue()
	{
	continueButton.click();
	}
	

}
