import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

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
        Thread.sleep(15000);
        driver.quit();






    }
}
