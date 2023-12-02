package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	WebDriver driver;

	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutbtn;

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
		
	//Create a constructor
			public LogoutPage(WebDriver driver){
				PageFactory.initElements(driver, this);
			}
			
			//Create a method
			public LoginPage Logout() {
				logoutbtn.click();
				
				return new LoginPage(driver);
				
			}
		
		
		
	}


