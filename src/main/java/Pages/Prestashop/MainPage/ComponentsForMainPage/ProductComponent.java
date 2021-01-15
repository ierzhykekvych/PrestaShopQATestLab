package Pages.Prestashop.MainPage.ComponentsForMainPage;

import Pages.BasePage;
import Pages.Locators;
import Pages.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

import static Pages.Locators.*;


public class ProductComponent extends BasePage implements Text {

    @FindBy(xpath = CURRENT_PRODUCTS)
    WebElement currentProducts;

    @FindBy(css = SORTING_SELECTOR)
    WebElement sortingSelector;

    @FindBy(css = PRISE_FROM_HIGH_TO_LOW)
    WebElement priseFromHighToLow;

    @FindBy(xpath = ADD_TO_CART_BUTTON)
    WebElement addToCartButton;

    @FindBy(xpath = PLUS_ONE_PRODUCT_BUTTON)
    WebElement plusOneProductButton;

    public List<String> getProductMiniatureList() {
        List<String> list = new ArrayList<>();
        List<WebElement> products = driver.findElements(By.xpath(PRODUCT_MINIATURE));
        for (WebElement product : products) {
            list.add(product.getText());
        }
        return list;
    }

    public int getProductPriseListFromHighToLow() {
        List<String> list = new ArrayList<>();
        List<Integer> integerList= new ArrayList<>();
        List<WebElement> products = driver.findElements(By.xpath(PRISE_ON_PRODUCTS));
        for (WebElement product : products) {
            list.add(product.getText());
            //char[] chars = list.stream().collect(Collectors.joining()).toCharArray();
            //for (char c : chars) {
                //if (c != '$' && c != '€' && c != '₴') {
                 //   character.add(c);
                //}
            //}
        }

        String str = list.toString();

        str = str.replaceAll("₴","");
        str = str.replaceAll("€","");
        str = str.replaceAll("\\$","");
        str = str.replaceAll(",", "");
        str = str.replaceAll(" ", "");
        str = str.replaceAll("\\]", "");
        str = str.replaceAll("\\[", "");
        //str = str.replaceAll("", "");
        System.out.println(str);
        int i = Integer.parseInt(str);
        int a = i*2;
        System.out.println(a);
        return i;
    }

    public void clickOnRandomProduct() {
    List<WebElement> list = driver.findElements(By.xpath(PRODUCT_MINIATURE));
    int size = list.size();
    int rand = ThreadLocalRandom.current().nextInt(0, size);
    list.get(rand).click();
    }

    public void clickOnRandomColorOfProduct() {
    List<WebElement> list = driver.findElements(By.xpath(SELECT_COLOR_BUTTONS));
    int size = list.size();
    int rand = ThreadLocalRandom.current().nextInt(0,size);
    list.get(rand).click();
    }

    public List<Character> getProductListInUAH() {
        List<String> list = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        List<WebElement> products = driver.findElements(By.xpath(PRODUCTS_IN_UAH));
        for (WebElement product : products) {
            list.add(product.getText());
        }
        char[] chars = list.stream().collect(Collectors.joining()).toCharArray();
        for (char c : chars)
            if (c == UAH) {
                characters.add(c);
            }
        return characters;
    }

    public List<Character> buildStringUAH(int n) {
        char c;
        char[] arr = new char[n];
        Arrays.fill(arr, c = UAH);
        List<Character> B = new ArrayList<>();
        for (char c1 : arr)
            B.add(c1);
        return B;
    }

    public List<Character> getProductListInEUR() {
        List<String> list = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        List<WebElement> products = driver.findElements(By.xpath(Locators.PRODUCTS_IN_EUR));
        for (WebElement product : products) {
            list.add(product.getText());
        }
        char[] chars = list.stream().collect(Collectors.joining()).toCharArray();
        for (char c : chars)
            if (c == EUR) {
                characters.add(c);
            }
        return characters;
    }

    public List<Character> buildStringEUR(int n) {
        char c;
        char[] arr = new char[n];
        Arrays.fill(arr, c = EUR);
        List<Character> B = new ArrayList<>();
        for (char c1 : arr)
            B.add(c1);
        return B;
    }

    public List<Character> getProductListInUSD() {
        List<String> list = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        List<WebElement> products = driver.findElements(By.xpath(Locators.PRODUCTS_IN_USD));
        for (WebElement product : products) {
            list.add(product.getText());
        }
        char[] chars = list.stream().collect(Collectors.joining()).toCharArray();
        for (char c : chars)
            if (c == USD) {
                characters.add(c);
            }
        return characters;
    }

    public List<Character> buildStringUSD(int n) {
        char c;
        char[] arr = new char[n];
        Arrays.fill(arr, c = USD);
        List<Character> B = new ArrayList<>();
        for (char c1 : arr)
            B.add(c1);
        return B;
    }

    public ProductComponent(WebDriver driver, WebElement element) {
        super(driver);
    }

    public String getCurrentProducts() {
        List<String> currentProducts = new ArrayList<>();
        List<WebElement> list = driver.findElements(By.xpath(CURRENT_PRODUCTS));
        for (WebElement element : list) {
            currentProducts.add(element.getText());
        }
        String str = currentProducts.toString();
        str = str.replaceAll("[^\\d.]", "");
        return str;
    }

    public void clickOnSortingSelector() {
        sortingSelector.click();
    }

    public void clickOnPriseFromHighToLow() {
        priseFromHighToLow.click();
    }

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void clickOnPlusOneProductButton() {
        plusOneProductButton.click();
    }

    public ProductComponent checkingTheLoadingOfClassicLabel() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Locators.CLASSIC_LABEL)));
        return this;
    }

}
