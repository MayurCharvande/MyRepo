package Test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.Login;
import Pojo.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_IndiaLocation 
{ 
	 protected ChromeDriver driver;
	    @BeforeClass
	    public void testSetUp() 
	    {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }
	    @Test
	    public void test_Selenium4_Geolocation() throws InterruptedException
	    {
	        Map< String,Object> coordinates = new HashMap< String,Object>();        
	        /* Create a hashmap for latitude, longitude, and accuracy as needed by Google Maps */
	        coordinates.put("latitude", 31.230416); 
	        coordinates.put("longitude", 121.473701);
	        coordinates.put("accuracy", 100);
	        
	        /* Command to emulate Geolocation */
	        driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
	        driver.navigate().to("https://my-location.org/ip-location.php");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//a[text()='My Address']")).click();
	        /*Scroll Down*/
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("javascript:window.scrollBy(0,350)");
	        Thread.sleep(3000);
	        
	    WebDriver driver = Browser.OpenBrowser("https://staging.legalops.com"+"/"+"admin");
	    	//driver = Browser.OpenBrowser("https://staging:9UXn7'ufSyG<Lr^2@staging.legalops.com/admin");
	    	Login obj1 = new Login(driver);
	    	obj1.enterAuthUser("staging");
	    	obj1.enterAuthPassword("9UXn7'ufSyG<Lr^2");
	    	obj1.clickOnSubmitButton();
	    	Thread.sleep(3000);
	    }
	    
}
