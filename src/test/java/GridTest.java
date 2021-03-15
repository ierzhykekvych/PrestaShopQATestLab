import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GridTest {
    static WebDriver driver;
    static String nodeURL;
    public static void main(String[] args) {
        try {
        nodeURL = "http://10.5.0.18:42452/wb/hub";

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
            driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
            driver.get("https://automation-remarks.com/nastraivaiem-selenium-grid-za-5-minut/");
            driver.findElement(By.xpath("//*[@id=\"navbarTogglerDemo01\"]/ul[2]/li[1]/a")).click();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
