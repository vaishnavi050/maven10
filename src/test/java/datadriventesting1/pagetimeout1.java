package datadriventesting1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagetimeout1 {

	public static void main(String[] args) {
		

		WebDriver driver=  new ChromeDriver ();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(420));//measure the time
		driver.manage().window().maximize();	
		//driver.get("https://demo.actitime.com/login.do");
		driver.get("//https://the-internet.herokuapp.com/basic_auth");
		
		
		//https://the-internet.herokuapp.com/basic_auth
	//	driver.findElement(By.id("username")).sendKeys("admin");
		// TODO Auto-generated method stub

	}

}
