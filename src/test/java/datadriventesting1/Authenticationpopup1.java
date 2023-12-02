package datadriventesting1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup1 {

	public static void main(String[] args) {
		

		WebDriver driver=  new ChromeDriver ();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(420));//measure the time
		driver.manage().window().maximize();	
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		// TODO Auto-generated method stub

	}

}
 