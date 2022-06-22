package com.framework.pageobjects.amazon;


import com.framework.webelements.Element;
import org.openqa.selenium.By;

import static com.framework.core.Browser.getTabCount;
import static com.framework.core.Browser.switchTab;

public class Amazon_ItemPage {
    // Elements
    public final static Element _textAboutThisItem = new Element("About this Item", By.xpath("//h1[text()=' About this item ']"));

    // Methods
    public static void verifyItemsPage() {
        System.out.println(getTabCount());
        switchTab();
        _textAboutThisItem.verifyDisplayed();
    }
}