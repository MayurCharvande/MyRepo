package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver OpenBrowser(String url) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		return driver;

	}
}
