package Pages.Prestashop;

import Pages.CommonPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Pages.Locators.THE_LOADING_OF_ELEMENTS;
import static Pages.Locators.CURRENCY;

public class PrestashopMainPageObject extends CommonPageObject {
    private static WebDriverWait wait;
    int timeOut = 3;

    @FindBy(xpath = CURRENCY)
    WebElement currency;

    @FindBy(xpath = THE_LOADING_OF_ELEMENTS)
    WebElement theLoadingOfElements;

    WebElement currencyDropdownMenu;
    WebElement productsList;

    public PrestashopMainPageObject(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, timeOut);
    }

    public CurrencyComponent getCurrency() {
        return new CurrencyComponent(driver, currencyDropdownMenu);
    }

    public ProductComponent getProducts() {
        return new ProductComponent(driver, productsList);
    }


    public WebElement checkingTheLoadingOfElements() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(THE_LOADING_OF_ELEMENTS)));
    }

    public void currencySelector() {
        currency.click();
    }
}
