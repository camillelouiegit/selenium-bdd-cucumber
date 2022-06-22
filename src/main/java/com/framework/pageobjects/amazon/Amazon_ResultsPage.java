package com.framework.pageobjects.amazon;

import com.framework.core.Browser;
import com.framework.webelements.Element;
import com.framework.webelements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class Amazon_ResultsPage {
	// Elements
		public final static Element _txtResults = new Element("Results Page", By.xpath("//span[text()='RESULTS']"));
		public final static Element _linkSort = new Element("Sort", By.xpath("//span[@id='a-autoid-0-announce']"));
		public final static Link _linkPriceHighToLow = new Link("Sort: Price High to Low", By.xpath("//a[text()='Price: High to Low']"));
		public final static Link _linkSecondResult = new Link("Second Highest Result", By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-2']//a"));

	// Methods
		public static void sortResult(){
			_txtResults.verifyDisplayed();
			_linkSort.click();
			_linkPriceHighToLow.click();
		}

		public static void clickSecondResult(){
			_linkSecondResult.click();
		}


}