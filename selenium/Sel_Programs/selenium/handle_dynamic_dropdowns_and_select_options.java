package selenium;

	import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.openqa.selenium.support.ui.Select;
	 public class handle_dynamic_dropdowns_and_select_options {
	 public static void main(String[] args) {
	// Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	// Launch Chrome browser
	 WebDriver driver = new ChromeDriver(); 
	// Navigate to a webpage with a dropdown/select element
	 driver.get("https://example.com"); 
	// Find the dropdown/select element
	 WebElement dropdown = driver.findElement(By.id("dropdown-id")); 
	// Create Select object
	 Select select = new Select(dropdown); 
	// Select an option by visible text
	 select.selectByVisibleText("Option 1"); 
	// Select an option by value
	 select.selectByValue("option1"); 
	// Select an option by index
	 select.selectByIndex(0); 
	// Perform further actions after dropdown handling
	 
	// ... 
	// Close the browser
	 driver.quit();
	 }
	 }