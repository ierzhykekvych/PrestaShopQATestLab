package Pages.Prestashop;

import Pages.CommonPageObject;
import Pages.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CurrencyComponent extends CommonPageObject {
    private static WebDriverWait wait;
    int timeOut = 3;
    @FindBy(css = Locators.EUR)
    WebElement eur;

    @FindBy(xpath = Locators.UAH)
    WebElement uah;

    @FindBy(xpath = Locators.USD)
    WebElement usd;

    public CurrencyComponent(WebDriver driver, WebElement element) {
        super(driver);
        wait = new WebDriverWait(driver, timeOut);
    }

    public CurrencyComponent getEur() {
        eur.click();
        return this;
    }

    public CurrencyComponent getUah() {
        uah.click();
        return this;
    }

    public CurrencyComponent getUsd() {
        usd.click();
        return this;
    }

    public WebElement checkingTheLoadingOfEurElements() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.EUR)));
    }

}
