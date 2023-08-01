package selenium;

import java.time.Duration; // import the Duration class for time units

import org.openqa.selenium.By; // import the By class for locating web elements
import org.openqa.selenium.WebDriver; // import the WebDriver interface for controlling browsers
import org.openqa.selenium.chrome.ChromeDriver; // import the ChromeDriver class for launching Chrome browser

public class Login_page {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        //implicit wait - 2 seconds time out
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // create a new instance of Chrome driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // set the implicit wait time to 5 seconds
        driver.get("https://rahulshettyacademy.com/locatorspractice/"); // navigate to the locators practice website

        driver.findElement(By.id("inputUsername")).sendKeys("rahul"); // find the username input field by id and enter "rahul"
        driver.findElement(By.name("inputPassword")).sendKeys("hello123"); // find the password input field by name and enter "hello123"
        driver.findElement(By.className("signInBtn")).click(); // find the sign in button by class name and click it
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); // find the error message by css selector and print it

        driver.findElement(By.linkText("Forgot your password?")).click(); // find the forgot password link by link text and click it
        Thread.sleep(1000); // pause the execution for 1 second

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John"); // find the name input field by xpath and enter "John"
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com"); // find the email input field by css selector and enter "john@rsa.com"
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // find the second input field with type text by xpath and clear it
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com"); // find the third input field with type text by css selector and enter "john@gmail.com"
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253"); // find the third input field inside the form by xpath and enter "9864353253"
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // find the reset password button by css selector and click it
        System.out.println(driver.findElement(By.cssSelector("form p")).getText()); // find the confirmation message by css selector and print it

        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); // find the first button inside the div with class forgot-pwd-btn-conainer by xpath and click it
        Thread.sleep(1000); // pause the execution for 1 second

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul"); // find the username input field by css selector and enter "rahul"
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); // find the input field with type containing pass by css selector and enter "rahulshettyacademy"
        driver.findElement(By.id("chkboxOne")).click(); // find the checkbox with id chkboxOne by id and click it
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // find the button with class containing submit by xpath and click
    }

}
