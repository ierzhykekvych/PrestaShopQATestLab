package Pages;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.management.ObjectName;
import java.util.*;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    int timeOut = 3;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, timeOut);
        PageFactory.initElements(driver, this);
    }

    public BasePage() {

    }

    public void waitForAnimation() {
    wait.until((ExpectedCondition<Boolean>) wdriver -> ((JavascriptExecutor)driver).executeScript("return document.readyState")
            .equals("complete"));
    }

    public void sort() {

        int[] a = new int[]{1,6,3,8,5};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    public void sor2t() {
        ObjectName[] arr = new ObjectName[10];

    };

    public static void main(String[] arr){
        BasePage basePage = new BasePage();
        basePage.sort();

    }
}
