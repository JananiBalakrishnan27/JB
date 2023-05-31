package chromedriver;

import java.io.FileReader;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;

public class edgeDriver {
	
	public void Driveropen() throws Exception{
		FileReader reader = new FileReader("C:\\Users\\gaja2\\eclipse-workspace\\Testingselenium\\src\\test\\java\\file.properties");
		Properties p = new Properties();
		p.load(reader);
		String chromeDriverPath = p.getProperty("path");
		//System.out.println(p.getProperty("path"));
		//System.setProperty("webdriver.chrome.driver", p.getProperty("path"));
		
		//ChromeDriver driver = new ChromeDriver();
		chromeDriverPath.get("https://www.facebook.com/");
		chromeDriverPath.manage().window().maximize();
		
		
	   	}
	public static void main(String[] args) throws Exception {
		edgeDriver e = new edgeDriver();
		e.Driveropen();
	}
		
	}



