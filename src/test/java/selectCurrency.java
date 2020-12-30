import Pages.BaseTest;
import Pages.Prestashop.PrestashopMainPageObject;
import Pages.URLs;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class selectCurrency extends BaseTest implements URLs{
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
    private static final String CHROME_DRIVER_LOCATION = "src\\test\\WebDrivers\\Chrome\\87.0.4280.88\\chromedriver.exe";

    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty(CHROME_DRIVER_PROPERTY, CHROME_DRIVER_LOCATION);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(PRESTASHOP);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public List<Character> buildString(char c, int n) {
        char[] arr = new char[n];
        Arrays.fill(arr, c);
        List<Character> B = new ArrayList<>();
        for (char c1 : arr)
            B.add(c1);
        System.out.print(B);
        return B;
    }

    @Test
    public void selectCurrencyTest() throws InterruptedException {
        PrestashopMainPageObject prestashopMainPageObject = new PrestashopMainPageObject(driver);
        prestashopMainPageObject.checkingTheLoadingOfElements();
        prestashopMainPageObject.currencySelector();
        //System.out.print(prestashopMainPageObject.getProducts().getProductList());
        //System.out.print(prestashopMainPageObject.getProducts().getProductList());
        //System.out.print(buildString('₴', prestashopMainPageObject.getProducts().getProductList().size()));
        //buildString('₴',3);
        Assert.assertEquals(prestashopMainPageObject.getProducts().getProductList(), buildString('₴', prestashopMainPageObject.getProducts().getProductList().size()));
        //System.out.print(buildString('f',3));
        Thread.sleep(1000);
        //prestashopMainPageObject.getCurrency().checkingTheLoadingOfEurElements();
        //prestashopMainPageObject.getCurrency().getEur();

    }

}
