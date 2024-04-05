import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DemoGridOnAws {

    public static void main(String[] args) throws InterruptedException {


        URL urlaws = null;
        try {
            urlaws = new URL("http://ec2-100-27-10-98.compute-1.amazonaws.com:4444/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        ChromeOptions awsgridOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(urlaws , awsgridOptions);

        Thread.sleep(15000);
        driver.manage().window().maximize();

        Thread.sleep(15000);

        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Execute JavaScript code to apply a border and change background color
        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background-color: yellow;');", driver.findElement(By.xpath("//input[@id='user-name']")));
        // Wait for a short duration to see the highlighted effect (optional)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Execute JavaScript code to remove the highlighting
        js.executeScript("arguments[0].setAttribute('style', 'border: none; background-color: none;');", driver.findElement(By.xpath("//input[@id='user-name']")));
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");



        driver.quit();






    }
}
