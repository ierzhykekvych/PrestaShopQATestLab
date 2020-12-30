package Pages.Prestashop;

import Pages.CommonPageObject;
import Pages.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductComponent extends CommonPageObject {

    public List<Character> getProductList() {
        List<String> list = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        List<WebElement> products = driver.findElements(By.xpath(Locators.PRODUCTS));
        for (WebElement product : products) {
            list.add(product.getText());
        }
        char[] chars = list.stream().collect(Collectors.joining()).toCharArray();
        for (char c : chars)
            if (c == '₴') {
                characters.add(c);
            }
        return characters;
    }

    public ProductComponent(WebDriver driver, WebElement element) {
        super(driver);
    }

}
