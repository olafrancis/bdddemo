package stepDefs;

//import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
//import java.net.URL;
import io.cucumber.java.en.*;

public class Invcalculator {

	WebDriver driver;

	@Given("a chrome browser is launch")
	public void a_chrome_browser_is_launch() throws MalformedURLException, InterruptedException {
		
		//src\main\resources\Driver\chromedriver.exe

		System.setProperty("webdriver.chrome.driver","D:\\Ade\\Resources\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.korita.online/investment-calculator/");

		//public static void setupTest() throws MalformedURLException {
		/*try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setBrowserName("chrome");
			caps.setPlatform(Platform.WINDOWS);

			WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.13:15206/wd/hub"), caps);
			driver.manage().window().maximize();
			Thread.sleep(10000);
			driver.get("https://www.facebook.com/");
			
		System.out.println("=== a chrome browser is open ===");
			
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		*/
		
		System.out.println("=== a chrome browser is open ===");
	}

	@When("user enter principal amount")
	public void user_enter_principal_amount() {

		System.out.println("=== user enter principal amount ===");

	}

	@When("user enter interest rate")
	public void user_enter_interest_rate() {

		System.out.println("=== user enter interest rate ===");
	}

	@When("user enter investment term")
	public void user_enter_investment_term() {

		System.out.println("=== user enter investment term ===");
	}

	@When("user select period")
	public void user_select_period() {

		System.out.println("=== user select period ===");

	}

	@When("user click the calculate button")
	public void user_click_the_calculate_button() {

		System.out.println("=== user click the calculate button ===");
	}

	@Then("user sees the calculation result")
	public void user_sees_the_calculation_result() {

		System.out.println("=== user sees the calculation result ===");
	}

	@Then("user closed the browser")
	public void user_closed_the_browser() {

		if (driver != null) {
			driver.close();
			driver.quit();
		}
			
		System.out.println("=== user closed the browser ===");

	}



	//	   @AfterClass
	//	   public static void tearDown() {
	//		   
	//		   if (driver != null) {
	//			   driver.quit();
	//			   	  
	//	          }
	//	   }





	//	@Given("a chrome browser is open")
	//	public void a_chrome_browser_is_open() {
	//
	//		//System.setProperty("webdriver.chrome.driver","src/test/resources/Driver/chromedriver.exe");
	//		//driver=new ChromeDriver();
	//		//driver.get("https://www.korita.online/investment-calculator/");
	//
	//		//System.out.println("a chrome browser is open");
	//	}
	//
	//	@When("user enter {string} amount")
	//	public void user_enter_amount(String string) {
	//
	//		//input[@id='ric_principal']
	//
	//		//System.out.println("a chrome browser is open");
	//	}
	//
	//	@When("user enter {string} rate")
	//	public void user_enter_rate(String string) {
	//
	//		//input[@id='ric_interest_rate']
	//
	//		//System.out.println("a chrome browser is open");
	//
	//	}
	//
	//	@When("user enter {string} term")
	//	public void user_enter_term(String string) {
	//
	//		//input[@id='ric_term']
	//
	//		//System.out.println("a chrome browser is open");
	//	}
	//
	//	@When("user select {string}")
	//	public void user_select(String string) {
	//
	//		//select[@id='ric_compounding_period']
	//
	//		//System.out.println("a chrome browser is open");
	//
	//	}
	//
	//	@When("user click the calculate button")
	//	public void user_click_the_calculate_button() {
	//
	//		//input[@id='ric_submit']
	//
	//		//System.out.println("a chrome browser is open");
	//	}
	//
	//	@Then("user sees the calculation result")
	//	public void user_sees_the_calculation_result() {
	//
	//		//div[@id='ric_results']
	//
	//		//System.out.println("a chrome browser is open");
	//
	//	}
	//
	//	@Then("user closed the browser")
	//	public void user_closed_the_browser() {
	//
	//		//driver.close();
	//		//driver.quit();
	//	}

}
