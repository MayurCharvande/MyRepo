package Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import java.util.Map;
import java.util.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TC_GeoLocation 
{ 
	public class GeoLocationTest {
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
	    }
	    @AfterClass
	    public void tearDown()
	    {
	        if (driver != null) 
	        {
            driver.quit();
	    }
	    }
	}
}
