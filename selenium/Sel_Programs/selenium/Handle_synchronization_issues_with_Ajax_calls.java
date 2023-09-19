package selenium;

	import org.openqa.selenium.JavascriptExecutor;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.openqa.selenium.support.ui.ExpectedConditions;
	 import org.openqa.selenium.support.ui.WebDriverWait; 
	 public class Handle_synchronization_issues_with_Ajax_calls {
	 public static void main(String[] args) {
	 
	// Set the path of the ChromeDriver executable
	 System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 
	// Launch Chrome browser
	 WebDriver driver = new ChromeDriver(); 
	// Navigate to a webpage
	 driver.get("https://example.com"); 
	// Wait for the Ajax call to complete
	 WebDriverWait wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.jsReturnsValue("return jQuery.active == 0")); 
	// Perform further actions after Ajax call completion
	 
	// ... 
	// Close the browser
	 driver.quit();
	 }
	 }

}
