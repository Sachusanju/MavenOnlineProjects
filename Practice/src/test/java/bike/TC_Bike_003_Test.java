package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_Bike_003_Test {
	
	
		@Test
		public void launch()
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bmw-motorrad.in/");
			driver.quit();
		}

}
