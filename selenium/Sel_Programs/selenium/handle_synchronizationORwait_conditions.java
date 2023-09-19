package selenium;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.openqa.selenium.support.ui.ExpectedConditions;
	 import org.openqa.selenium.support.ui.WebDriverWait;
	 public class handle_synchronizationORwait_conditions {
	 public static void main(String[] args) {
	 // Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	// Launch Chrome browser
	 WebDriver driver = new ChromeDriver(); 
	// Set the maximum wait time in seconds
	 int waitTime = 10; 
	// Navigate to a webpage
	 driver.get("https:example.com"); 
	// Wait for an element to be visible
	 WebDriverWait wait = new WebDriverWait(driver, waitTime);
	 WebElement element = 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element-id"))); 
	// Perform further actions after synchronization
	 
	// ... 
	// Close the browser
	 driver.quit();
	 }
	 

}
