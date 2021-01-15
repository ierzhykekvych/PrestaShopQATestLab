package Pages.Prestashop.MainPage.ComponentsForMainPage;

import Pages.CommonPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class vtextFromBuffer extends CommonPageObject {

    public vtextFromBuffer(WebDriver driver) {
        super(driver);
    }

    public String sad() {
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(null);
        boolean hasStringText = (contents != null) && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if (hasStringText) {
            try {
                result = (String) contents.getTransferData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException | IOException ex) {
                System.out.println(ex);
                ex.printStackTrace();
            }
        }
        return result;
    }

    public void qwe() {
        Pattern pattern =
                Pattern.compile("\\S+", Pattern.UNICODE_CHARACTER_CLASS
                        | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sad());
        List<String> words = new ArrayList<>();

        while (matcher.find())
            words.add(matcher.group());

        System.out.println(words.get(words.size()-1));
    }
}
