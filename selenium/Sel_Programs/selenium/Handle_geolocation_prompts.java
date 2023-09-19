package selenium;

	import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.openqa.selenium.chrome.ChromeOptions; 
	 public class Handle_geolocation_prompts {
	 public static void main(String[] args) {
	 
	// Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	// Create ChromeOptions instance
	 ChromeOptions options = new ChromeOptions(); 
	// Set geolocation coordinates
	 options.setExperimentalOption("geolocation", "{\"latitude\": 37.421999, \"longitude\": -"+ "122.084}"); 
	// Launch Chrome browser with options
	 WebDriver driver = new ChromeDriver(options); 
	// Perform actions after setting geolocation
	 
	// ... 
	// Close the browser
	 driver.quit();
	 }
	 }
