package selenium;

	import org.openqa.selenium.JavascriptExecutor;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.chrome.ChromeDriver; 
	 import org.openqa.selenium.By;
	 import org.openqa.selenium.WebElement;

	 public class performing_scrolling_actions 
	 
	 {
	 public static void main(String[] args) {
	 // Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	// Launch Chrome browser
	 WebDriver driver = new ChromeDriver(); 
	// Scroll vertically by pixel
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0, 500)"); 
	// Scroll vertically to an element
	 WebElement element = driver.findElement(By.id("element-id"));
	 js.executeScript("arguments[0].scrollIntoView();", element); 
	// Scroll horizontally by pixel
	 js.executeScript("window.scrollBy(500, 0)"); 
	// Perform further actions after scrolling
	 // ... 
	// Close the browser
	 driver.quit();
	 }
	 }
	 


