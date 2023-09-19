package selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_cookies {
    public static void main(String[] args) {

        // Set the path of the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        // Navigate to a webpage
        driver.get("https://example.com");
        // Add a cookie
        Cookie cookie = new Cookie("cookie-name", "cookie-value");
        driver.manage().addCookie(cookie);
        // Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        // Delete a cookie
        driver.manage().deleteCookie(cookie);
        // Delete all cookies
        driver.manage().deleteAllCookies();
        // Perform further actions after cookie handling

        // ...
        // Close the browser
        driver.quit();
    }
}
