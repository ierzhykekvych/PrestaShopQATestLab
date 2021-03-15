package Pages.Prestashop.MainPage.ComponentsForMainPage;

import Pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Pages.Locators.EMAIL_FIELD;

public class SignInGooglePage extends BasePage {

    @FindBy(xpath = EMAIL_FIELD)
    WebElement emailField;

    public SignInGooglePage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }
}

