package datadriventesting1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript02demoskill {

	public static void main(String[] args) {
		
		
		

		WebDriver driver=  new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		driver.get("https://demoapp.skillrary.com/"); 
	
		WebElement tf = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		JavascriptExecutor jse=((JavascriptExecutor) driver);
		jse.executeScript("arguments[0].value='pune'",tf);
		
//		

	}

}
