package selenium;

	import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.openqa.selenium.interactions.Actions;
	 public class handle_dragAndDropActions {
	 public static void main(String[] args) {
	 
	// Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	// Launch Chrome browser
	 WebDriver driver = new ChromeDriver(); 
	// Navigate to a webpage
	 driver.get("https://example.com"); 
	// Find the source and target elements for drag and drop
	 WebElement sourceElement = driver.findElement(By.id("source-element"));
	 WebElement targetElement = driver.findElement(By.id("target-element")); 
	// Perform drag and drop action
	 Actions actions = new Actions(driver);
	 actions.dragAndDrop(sourceElement, targetElement).build().perform(); 
	// Perform further actions after drag and drop
	 
	// ... 
	// Close the browser
	 driver.quit();
	 }
	 }