package stepDefs;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CrossBrowserTesting {
	
	
	    public WebDriver driver;
	    String Node = "http://localhost:4444";
	    boolean status = false;
	 
	    @BeforeClass
	    public void testSetUp() throws MalformedURLException {
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setBrowserName("chrome");
	 
	        /* The execution happens on the Selenium Grid with the address mentioned earlier */
	        driver = new RemoteWebDriver(new URL(Node), caps);
	    }
	    
	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

}
