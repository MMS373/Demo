package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class JavaScriptAlerts {
public static void main(String[] args) {
// Set the path of the ChromeDriver executable
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//Launch Chrome browser
WebDriver driver = new ChromeDriver(); 
//Navigate to a webpage with a JavaScript alert
driver.get("https://example.com"); 
//Click a button that triggers a JavaScript alert
driver.findElement(By.id("alert-button")).click(); 
//Switch to the alert
Alert alert = driver.switchTo().alert(); 
//Get the text of the alert
String alertText = alert.getText(); 
//Accept the alert
alert.accept(); 
//Dismiss the alert
 alert.dismiss(); 
//Perform further actions after handling the alert
// ... 
//Close the browser
driver.quit();
}
}