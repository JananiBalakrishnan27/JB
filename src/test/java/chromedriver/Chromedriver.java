package chromedriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {
	
	public void Chrome() throws IOException, Throwable{
		FileReader reader = new FileReader("C:\\Users\\gaja2\\eclipse-workspace\\Testingselenium\\src\\test\\java\\file.properties");
		Properties p = new Properties();
		p.load(reader);
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
						
	}
	public static void main(String[] args) throws Throwable  {
		
	Chromedriver c = new Chromedriver();
	c.Chrome();
		
	}
	

}