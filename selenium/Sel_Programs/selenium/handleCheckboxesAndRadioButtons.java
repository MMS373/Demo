package selenium;

	import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver; 
	 public class handleCheckboxesAndRadioButtons {
	 public static void main(String[] args) {
	 
	// Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	// Launch Chrome browser
	 WebDriver driver = new ChromeDriver(); 
	// Find a checkbox element
	 WebElement checkbox = driver.findElement(By.id("checkbox-id")); 
	// Check the checkbox if it is not selected
	 if (!checkbox.isSelected()) {
	 checkbox.click();
	 } 
	// Find a radio button element
	 WebElement radioButton = driver.findElement(By.id("radio-button-id")); 
	// Select the radio button if it is not selected
	 if (!radioButton.isSelected()) {
	 radioButton.click();
	 } 
	// Perform further actions after checkbox and radio button handling
	 
	// ... 
	// Close the browser
	 driver.quit();
	 }
	 }


