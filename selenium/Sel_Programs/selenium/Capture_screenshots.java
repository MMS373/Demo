package selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_screenshots {
	public static void main(String[] args) {
// Set the path of the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		// Navigate to a webpage
		driver.get("https://example.com");
		// Capture the screenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
// Save the screenshot to a specific location
		File destFile = new File("path/to/save/screenshot.png");
		FileUtils.copyFile(srcFile, destFile);
// Close the browser
		driver.quit();
	}
}
