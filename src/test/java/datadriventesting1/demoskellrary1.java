package datadriventesting1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoskellrary1 {

	public static void main(String[] args) throws IOException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to read data from external resourses
		FileInputStream fis =new FileInputStream("src\\test\\resources\\actitime.properties");
		
		//TO READ DATA FROM PROPERTY FILE
		Properties p= new Properties();
		
		//to read key from property
		p.load(fis);
		
	  String URL = p.getProperty("urls");
	  String USERNAME = p.getProperty("uname");
	  String PASSWORD = p.getProperty("pwd");
	  
		driver.get(URL);
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD );
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("last")).click();
		
		
		 
		// TODO Auto-generated method stub

	}

}
