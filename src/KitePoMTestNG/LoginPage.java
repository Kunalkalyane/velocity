package KitePoMTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

		@FindBy(id = "userid") private WebElement UserID;//
		@FindBy(id="password")   private WebElement Password;
		@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
		
		//Create constructor
		public LoginPage(WebDriver driver)
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


	}


