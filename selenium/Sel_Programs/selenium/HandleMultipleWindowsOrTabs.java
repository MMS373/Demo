package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;
import java.util.*;

public class HandleMultipleWindowsOrTabs {
    public static void main(String[] args) {
        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        // Open a new window/tab
        driver.get("https://example.com");

        // Store the main window handle
        String mainWindowHandle = driver.getWindowHandle();

        // Open a new window/tab
        driver.switchTo().newWindow(WindowType.WINDOW);

        // Get the window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Store the window handles and titles in a Map
        Map<String, String> windowMap = new HashMap<>();
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            windowMap.put(windowHandle, driver.getTitle());
        }

        // Close the current window/tab
        driver.close();

        // Switch back to the main window/tab
        driver.switchTo().window(mainWindowHandle);

        // Perform further actions on the main window/tab

        // Close the browser
        driver.quit();
    }
}
