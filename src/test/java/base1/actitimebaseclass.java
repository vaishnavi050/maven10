package base1;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pom.LoginPage;
import pom.LogoutPage;

public class actitimebaseclass {

	public static void main(String[] args) {
		  

		ChromeDriver driver=  new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		driver.get("https://demo.actitime.com/login.do");
		
		LoginPage lp=new  LoginPage(driver);
		lp.Login("admin", "manager");
//		PageFactory.initElements(driver, lp);
//		lp.getUsernametf().sendKeys("admin");
//		lp.getPwdtf().sendKeys("manager");
//		lp.getCheckbox().click();
//		lp.getLoginbtn().click();
		
		
		LogoutPage lop=new LogoutPage (driver);
		lop.Logout();
//		PageFactory.initElements(driver, lop);
//		lop.getLogoutbtn().click();
	}

}
