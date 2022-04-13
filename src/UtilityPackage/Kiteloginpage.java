package UtilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
//variable Declaration
		@FindBy(id = "userid") private WebElement UserID;//
		@FindBy(id="password")   private WebElement Password;
		@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
		@FindBy(xpath="span[contains(text(),'User ID should be')]") private WebElement UserIdErrorMsg;
		
		//Create constructor
		public Kiteloginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);	
		}

		public void enteruserid(String uid)
		{
		UserID.sendKeys(uid);
		}
		
		public void Enterpasword(String pwd)
		{
			Password.sendKeys(pwd);
		}
		public void clickonloginbutton()
		{
			LoginButton.click();
		}
		public String getuserIderrorMsg() {
			String errorMsg=UserIdErrorMsg.getText();
			return errorMsg;
		}

}

