package selenium;

	import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
	 import org.openqa.selenium.WebElement;
	 import org.openqa.selenium.chrome.ChromeDriver;
	 public class handle_locate_web_elements {
	 public static void main(String[] args) {
	 // Set the path of the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	 // Launch Chrome browser
	 WebDriver driver = new ChromeDriver();
	 // Find element by ID
	 WebElement elementById = driver.findElement(By.id("element-id"));
	 // Find element by name
	 WebElement elementByName = driver.findElement(By.name("element-name"));
	 // Find element by class name
	 WebElement elementByClassName = driver.findElement(By.className("element-class"));
	 // Find element by XPath
	 WebElement elementByXPath = 
	driver.findElement(By.xpath("//tagname[@attribute='value']"));
	 // Find element by CSS selector
	 WebElement elementByCssSelector = 
	driver.findElement(By.cssSelector("tagname[attribute='value']"));
	 // Find element by link text
	 WebElement elementByLinkText = driver.findElement(By.linkText("Link Text"));
	 // Find element by partial link text
	 WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("PartialLink Text"));
	 // Perform further actions on the elements
	 // ...
	 // Close the browser
	 driver.quit();
	 }
	 }