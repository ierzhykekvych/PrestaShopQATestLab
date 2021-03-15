package Pages;

import java.awt.*;

public @interface Locators {

    String CURRENCY = "//span[@class= \"expand-more _gray-darker hidden-sm-down\"]";
    String THE_LOADING_OF_ELEMENTS = "//a[@class = \"banner hidden-sm-down\"]";
    String EUR = "//a[text() = \"EUR €\"]";
    String UAH = "//a[text() = \"UAH ₴\"]";
    String USD = "//a[text() = \"USD $\"]";
    String CLASSIC_LABEL = "[href=\"http://prestashop-automation.qatestlab.com.ua/\"]";
    String PRODUCTS_IN_UAH = "//div[contains(@class,\"product\")]/span[contains(text(), '₴')]";
    String PRODUCTS_IN_EUR = "//div[contains(@class,\"product\")]/span[contains(text(), '€')]";
    String PRODUCTS_IN_USD = "//div[contains(@class,\"product\")]/span[contains(text(), '$')]";
    String SEARCH_THE_DIRECTORY = "//input[@name = \"s\"]";
    String PRODUCT_MINIATURE = "//a/img[starts-with(@src, 'htt')]";
    String CURRENT_PRODUCTS = "//p[starts-with(text(), 'Товаров') ]";
    String SORTING_SELECTOR = "[class=\"select-title\"]";
    String PRISE_FROM_HIGH_TO_LOW = "[href=\"http://prestashop-automation.qatestlab.com.ua/ru/search?controller=search&order=product.price.desc&s=dress\"]";
    String PRISE_ON_PRODUCTS = "//span[@itemprop=\"price\"]";
    String ADD_TO_CART_BUTTON = "//button[starts-with(@class, 'btn btn-primary') ]";
    String PLUS_ONE_PRODUCT_BUTTON = "//button[@class = \"btn btn-touchspin js-touchspin bootstrap-touchspin-up\"]";
    String SELECT_COLOR_BUTTONS = "//ul/li[@class = \"pull-xs-left input-container\"]";
    String SIGN_IN = "//div[@class = \"gb_Lf\"]/a[@class = \"gb_be gb_4 gb_5c\"]";
    String EMAIL_FIELD = "//input[@type = \"email\"]";
}
