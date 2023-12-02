package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	     WebDriver driver;
		
		@FindBy(id="username")
		private WebElement usernametf;
		
		

		@FindBy(name="pwd")
		private WebElement pwdtf;
		
		

		@FindBy(id="keepLoggedInCheckBox")
		private WebElement checkbox;
		
		

		@FindBy(xpath="//div[text()='Login ']")
		private WebElement loginbtn;



		public WebElement getUsernametf() {
			return usernametf;
		}



		public WebElement getPwdtf() {
			return pwdtf;
		}



		public WebElement getCheckbox() {
			return checkbox;
		}



		public WebElement getLoginbtn() {
			return loginbtn;
		}
		
		//Create a constructor
		public LoginPage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		
		//Create a method
		public LogoutPage Login(String usernamedata,String passworddata) {
			usernametf.sendKeys(usernamedata);
			pwdtf.sendKeys(passworddata);
			checkbox.click();
			loginbtn.click();
			
			return new LogoutPage(driver);
			
		}
		
		
		// TODO Auto-generated method stub

	}

