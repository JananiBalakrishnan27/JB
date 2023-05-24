package chromedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {
	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/downloads");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}