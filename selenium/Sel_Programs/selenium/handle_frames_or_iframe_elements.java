package selenium;

	 import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver; 
	 public class handle_frames_or_iframe_elements {
	 public static void main(String[] args) {
	 // Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	// Launch Chrome browser
	 WebDriver driver = new ChromeDriver(); 
	// Switch to a frame by index
	 driver.switchTo().frame(0); 
	// Switch to a frame by name or ID
	 driver.switchTo().frame("frame-name"); 
	// Switch to a frame by WebElement
	 WebElement frameElement = driver.findElement(By.id("frame-id"));
	 driver.switchTo().frame(frameElement); 
	// Switch back to the default content
	 driver.switchTo().defaultContent(); 
	// Perform further actions within the frame
	 // ... 
	// Close the browser
	 driver.quit();
	 }
	 }



