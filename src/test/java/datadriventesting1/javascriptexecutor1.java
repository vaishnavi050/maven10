package datadriventesting1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=  new ChromeDriver ();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		driver.get("https://www.google.com/doodles"); 
		
		JavascriptExecutor jse=((JavascriptExecutor) driver);//downcasting
		
//		jse.executeScript("window.alert('good mornimg')");//to design popup
		
//		jse.executeScript("window.scrollBy(0,20000)");
		
		//to handle the exception
		
		for(;;)
		{
			try
			{
				driver.findElement(By.xpath("//a[text()='Canada Day 2016']")).click();
				
				
			}
			catch(NoSuchElementException e)
			{
				jse.executeScript("window.scrollBy(0,20000)");
			}
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
