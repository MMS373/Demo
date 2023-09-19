package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class perform_file_uploads {
	public static void main(String[] args) {
// Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//Launch Chrome browser
		WebDriver driver = new ChromeDriver();
//Navigate to a webpage with a file upload input
		driver.get("https://example.com");
//Find the file upload input element
		WebElement fileInput = driver.findElement(By.id("file-input-id"));
//Provide the file path to upload
		String filePath = "path/to/file.txt";
		fileInput.sendKeys(filePath);
//Perform further actions after file upload
// ... 
//Close the browser
		driver.quit();
	}
}
