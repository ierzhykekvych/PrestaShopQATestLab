package Pages.Prestashop.MainPage.ComponentsForMainPage;

import Pages.BasePage;
import Pages.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CurrencyComponent extends BasePage {

    @FindBy(xpath = Locators.EUR)
    WebElement eur;

    @FindBy(xpath = Locators.UAH)
    WebElement uah;

    @FindBy(xpath = Locators.USD)
    WebElement usd;

    public CurrencyComponent(WebDriver driver, WebElement element) {
        super(driver);
    }

    public CurrencyComponent clickOnEUR() {
        eur.click();
        return this;
    }

    public CurrencyComponent clickOnUAH() {
        uah.click();
        return this;
    }

    public CurrencyComponent clickOnUSD() {
        usd.click();
        return this;
    }

    public CurrencyComponent checkingTheLoadingOfEurElements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.EUR)));
        return this;
    }

    public CurrencyComponent checkingTheLoadingOfUahElements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.UAH)));
        return this;
    }

    public CurrencyComponent checkingTheLoadingOfUsdElements() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locators.USD)));
        return this;
    }

}
