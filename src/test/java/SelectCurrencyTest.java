import Pages.BaseTest;
import Pages.Currency;
import Pages.Prestashop.MainPage.PrestashopMainPageObject;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Ignore;

public class SelectCurrencyTest extends BaseTest{
    @Ignore
    @Test
    public void selectCurrencyTest() {

        PrestashopMainPageObject prestashopMainPageObject = new PrestashopMainPageObject(driver);
        prestashopMainPageObject.waitForAnimation();

        prestashopMainPageObject.checkingTheLoadingOfElements();
        prestashopMainPageObject
                .getHeader()
                .currencySelector()
                .getCurrency()
                .checkingTheLoadingOfEurElements()
                .clickOnEUR();
        System.out.println(prestashopMainPageObject.getProducts().getProductListInEUR());
        Assert.assertEquals(prestashopMainPageObject.getProducts().getProductListInEUR(), prestashopMainPageObject.getProducts().buildStringEUR(prestashopMainPageObject.getProducts().getProductListInEUR().size()));
        prestashopMainPageObject.getHeader()
                .currencySelector()
                .getCurrency()
                .checkingTheLoadingOfUahElements()
                .clickOnUAH();
        System.out.println(prestashopMainPageObject.getProducts().getProductListInUAH());
        Assert.assertEquals(prestashopMainPageObject.getProducts().getProductListInUAH(), prestashopMainPageObject.getProducts().buildStringUAH(prestashopMainPageObject.getProducts().getProductListInUAH().size()));
        prestashopMainPageObject.getHeader()
                .currencySelector()
                .getCurrency()
                .checkingTheLoadingOfUsdElements()
                .clickOnUSD();
        System.out.println(prestashopMainPageObject.getProducts().getProductListInUSD());
        Assert.assertEquals(prestashopMainPageObject.getProducts().getProductListInUSD(), prestashopMainPageObject.getProducts().buildStringUSD(prestashopMainPageObject.getProducts().getProductListInUSD().size()));
        prestashopMainPageObject.getHeader().searchTheDirectoryField();
        Assert.assertEquals(prestashopMainPageObject.getProducts().getProductMiniatureList().size()+".", prestashopMainPageObject.getProducts().getCurrentProducts());

        prestashopMainPageObject.getProducts().clickOnSortingSelector();

        //prestashopMainPageObject.getProducts().clickOnPriseFromHighToLow();

        //System.out.println(prestashopMainPageObject.getProducts().getProductPriseListFromHighToLow());

        prestashopMainPageObject.getProducts().clickOnRandomProduct();
        prestashopMainPageObject.getProducts().checkingTheLoadingOfClassicLabel();
        prestashopMainPageObject.getProducts().clickOnRandomColorOfProduct();
        prestashopMainPageObject.getProducts().clickOnAddToCartButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
