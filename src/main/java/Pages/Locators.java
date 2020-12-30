package Pages;

public @interface Locators {

    String CURRENCY = "//span[@class= \"expand-more _gray-darker hidden-sm-down\"]";
    String THE_LOADING_OF_ELEMENTS = "//a[@class = \"banner hidden-sm-down\"]";
    String EUR = "[class = \"dropdown-item\"]";
    //String EUR ="[title = \"Евро\"]";
    //String EUR = "//ul[@class = \"dropdown-menu hidden-sm-down\"]/li/a[@title=\"Евро\"]";
    String UAH = "/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/ul/li[2]/a";
    String USD = "/html/body/main/header/nav/div/div/div[1]/div[2]/div[2]/div/ul/li[3]/a";
    String PRODUCTS = "//div[contains(@class,\"product\")]/span[contains(text(), '₴')]";
}
