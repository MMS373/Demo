package selenium;

	import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.openqa.selenium.chrome.ChromeOptions; 
	 public class Handle_browser_notifications {
	 public static void main(String[] args) {
	 
	// Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	// Create ChromeOptions instance
	 ChromeOptions options = new ChromeOptions(); 
	// Disable browser notifications
	 options.addArguments("--disable-notifications"); 
	// Launch Chrome browser with options
	 WebDriver driver = new ChromeDriver(options); 
	// Perform actions after disabling notifications
	 
	// ... 
	// Close the browser
	 driver.quit();
	 }
	 }
