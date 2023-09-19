package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; public class mouse_hover_actions {
public static void main(String[] args) {
// Set the path of the ChromeDriver executable
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//Launch Chrome browser
WebDriver driver = new ChromeDriver(); 
//Find the element to hover over
WebElement element = driver.findElement(By.id("element-id")); 
//Create an Actions object
Actions actions = new Actions(driver); 
//Perform mouse hover action
actions.moveToElement(element).perform(); 
//Perform further actions after the mouse hover
// ... 
//Close the browser
driver.quit();
}
}
