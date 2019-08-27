package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	@Test
	public void testOne()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl()); 
		driver.close();
		
	}
}
