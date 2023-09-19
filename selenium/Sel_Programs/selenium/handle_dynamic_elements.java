package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handle_dynamic_elements {
    public static void main(String[] args) {

        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        // Navigate to a webpage
        driver.get("https://example.com"); // Added a slash (/) after https:
        // Wait for a dynamic element to be visible
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element =
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamic-element-id")));
        // Perform further actions on the dynamic element

        // ...
        // Close the browser
        driver.quit();
    }
}
