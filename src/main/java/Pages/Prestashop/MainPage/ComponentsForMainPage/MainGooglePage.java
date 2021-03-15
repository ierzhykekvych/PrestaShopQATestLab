package Pages.Prestashop.MainPage.ComponentsForMainPage;

import Pages.BasePage;
import Pages.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainGooglePage extends BasePage {

    @FindBy(xpath = Locators.SIGN_IN)
    WebElement signIn;

    public MainGooglePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSignIn() {
        signIn.click();
    }

}
