package datadriventesting1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserreaddata1 {

	public static void main(String[] args) throws IOException {
		
		
		final WebDriver driver;
		FileInputStream fis =new FileInputStream("src\\test\\resources\\actitime.properties");
		Properties p=new Properties();
		p.load(fis);
		String BROWSER=p.getProperty("browser");
		
		
		
		if(BROWSER.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();	
			
	    }
		
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else
			{
				driver=new EdgeDriver();
			}
		
		
		
	
		
		// TODO Auto-generated method stub

	}

}
