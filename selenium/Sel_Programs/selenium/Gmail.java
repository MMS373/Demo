package selenium;

import java.time.Duration; // import the Duration class for time units
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; // import the By class for locating web elements
import org.openqa.selenium.WebDriver; // import the WebDriver interface for controlling browsers
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; // import the ChromeDriver class for launching Chrome browser
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        //implicit wait - 2 seconds time out
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\your_directory\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://accounts.google.com/signin";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); 
        WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
        email_phone.sendKeys("your_email_phone");
        driver.findElement(By.id("identifierNext")).click();
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(password));
        password.sendKeys("your_password");
        driver.findElement(By.id("passwordNext")).click();  }

}
