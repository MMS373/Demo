package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handle_actions_on_web_elements {
	public static void main(String[] args) {
		// Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		// Find the element
		WebElement element = driver.findElement(By.id("element-id"));
		// Click on the element
		element.click();
		// Type text into an input field
		element.sendKeys("Text to type");
		// Clear the text in an input field
		element.clear();
		// Get the text of an element
		String elementText = element.getText();
		// Get the value of an attribute
		String attributeValue = element.getAttribute("attribute-name");
		// Perform further actions on the element
		// ...
		// Close the browser
		driver.quit();
	}
}