package Pages.Prestashop.MainPage;

import Pages.BasePage;

import Pages.Prestashop.MainPage.ComponentsForMainPage.ProductComponent;
import Pages.Prestashop.MainPage.ComponentsForMainPage.HeaderComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Pages.Locators.THE_LOADING_OF_ELEMENTS;

public class PrestashopMainPageObject extends BasePage {
    WebElement header;
    private static WebDriverWait wait;
    int timeOut = 5;

    WebElement productsList;

    public PrestashopMainPageObject(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, timeOut);
    }

    public PrestashopMainPageObject waitForLoadPage() {
        waitForAnimation();
        return this;
    }

    public HeaderComponent getHeader() {
        return new HeaderComponent(driver, header);
    }

    public ProductComponent getProducts() {
        return new ProductComponent(driver, productsList);
    }


    public WebElement checkingTheLoadingOfElements() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(THE_LOADING_OF_ELEMENTS)));
    }

}
