package selenium;

	import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 import org.openqa.selenium.chrome.ChromeOptions; 
	 public class Handle_file_downloads {
	 public static void main(String[] args) {
	 
	// Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	// Create ChromeOptions instance
	 ChromeOptions options = new ChromeOptions(); 
	// Set download directory
	 options.addArguments("--download.default_directory=/path/to/download/directory"); 
	// Launch Chrome browser with options
	 WebDriver driver = new ChromeDriver(options); 
	// Perform actions that trigger file download
	 WebElement downloadButton = driver.findElement(By.id("download-button"));
	 downloadButton.click(); 
	// Perform further actions after file download
	 
	// ... 
	// Close the browser
	 driver.quit();
	 }
	 }



