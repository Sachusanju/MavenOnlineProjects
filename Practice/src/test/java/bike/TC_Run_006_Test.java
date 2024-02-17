package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Run_006_Test {
	
	@Test
	public void run()
	{
		String url = System.getProperty("url");
		System.out.println(url);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.quit();
	}

}
