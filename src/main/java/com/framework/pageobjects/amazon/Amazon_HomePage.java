package com.framework.pageobjects.amazon;

import com.framework.webelements.Link;
import org.openqa.selenium.By;

public class Amazon_HomePage {
    public static class HamburgerMenu {
        // Elements
        public final static Link _linkAllMenu = new Link("Hamburger Menu", By.xpath("//a[@id='nav-hamburger-menu']"));
        public final static Link _linkTvAppliances = new Link("TV, Appliances, Electronics", By.xpath("//a[@data-menu-id='9']"));
        public final static Link _linkTelevision = new Link("Televisions", By.xpath("//a[text()='Televisions']"));
        public final static Link _linkSamsung = new Link("Brand: Samsung", By.xpath("//span[text()='Samsung']//ancestor::a"));

        // Methods
        public static void searchForTelevisionBrand() {
            _linkAllMenu.click();
            _linkTvAppliances.click();
            _linkTelevision.click();
            _linkSamsung.click();
        }
    }
}