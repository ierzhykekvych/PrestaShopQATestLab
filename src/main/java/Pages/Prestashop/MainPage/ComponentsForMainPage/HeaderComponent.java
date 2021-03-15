package Pages.Prestashop.MainPage.ComponentsForMainPage;

import Pages.BasePage;
import Pages.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Pages.Locators.*;

public class HeaderComponent extends BasePage implements Text {

    WebElement currencyDropdownMenu;

    @FindBy(xpath = SEARCH_THE_DIRECTORY)
    WebElement searchTheDirectory;

    @FindBy(xpath = CURRENCY)
    WebElement currency;

    @FindBy(xpath = THE_LOADING_OF_ELEMENTS)
    WebElement theLoadingOfElements;

    public HeaderComponent(WebDriver driver, WebElement element) {
        super(driver);
    }

    public CurrencyComponent getCurrency() {
        return new CurrencyComponent(driver, currencyDropdownMenu);
    }

    public HeaderComponent currencySelector() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CURRENCY))).click();
        //currency.click();
        return this;
    }

    public void searchTheDirectoryField() {
        searchTheDirectory.sendKeys(textForSearchTheDirectory);
        searchTheDirectory.sendKeys(Keys.ENTER);
    }
}
