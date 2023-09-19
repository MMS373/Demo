package selenium;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopupWindowsAndChildWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        // Click a link/button that opens a new window/pop-up
        driver.findElement(By.id("new-window-button")).click();
        // Get the window handles
        Set<String> windowHandles = driver.getWindowHandles();
        // Switch to the new window/pop-up
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().equals("New Window")) {
                break;
            }
        }
        // Perform actions on the new window/pop-up
        // Close the new window/pop-up
        driver.close();
        // Switch back to the main window
        String mainWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(mainWindowHandle);
        // Perform further actions on the main window
        // Close the browser
        driver.quit();
    }
}
