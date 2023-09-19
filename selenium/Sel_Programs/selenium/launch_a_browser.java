package selenium;

	import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 public class launch_a_browser {
	 public static void main(String[] args) {
	 // Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	 // Launch Chrome browser
	 WebDriver driver = new ChromeDriver();
	 // Perform further actions on the browser
	 // ...
	 
	 // Close the browser
	 driver.quit();
	 }
	 }