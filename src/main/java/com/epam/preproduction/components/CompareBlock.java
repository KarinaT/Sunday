package com.epam.preproduction.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompareBlock {

	public static final String TD_COMPARE = "td";
	public static final String BG_VALUE = "rgba(255, 255, 225, 1)";
	public static final String BACKGROUND_COLOR = "background-color";
	public static final String DIFFERENT = "different";
	public static final String CLASS_COMPARE = "compare";

	public static final String CHARACTERISTIC_VALUE = "val";
	public static final String CHARACTERISTIC_TYPE = "pr";
	public static final String CHARACTERISTIC_ROW = "row";

	private static final String FIRST_ITEM = "//div[@class='item'][1]/div[@class='name']/a";
	private static final String SECOND_ITEM = "//div[@class='item'][2]/div[@class='name']/a";
	private static final String COMPARE = "//div[@class='compare-links']/span[1]";

	private static final String FIRST_COMPARE = "//div[@class='item'][1]/div[@class='compare-links']/span[1]";
	private static final String SECOND_COMPARE = "//div[@class='item'][2]/div[@class='compare-links']/span[1]";
	private static final String COMPARE_GOODS = "//div[@class='compare-links']/span[3]/a";

	@FindBy(xpath = FIRST_COMPARE)
	WebElement firstCompareElement;

	@FindBy(xpath = SECOND_COMPARE)
	WebElement secondCompareElement;

	@FindBy(xpath = COMPARE_GOODS)
	WebElement compareGoods;

	@FindBy(xpath = FIRST_ITEM)
	WebElement firstCompareItem;

	@FindBy(xpath = SECOND_ITEM)
	WebElement secondCompareItem;

	@FindBy(xpath = COMPARE)
	WebElement compareItemsLink;

	@FindBy(className = CLASS_COMPARE)
	WebElement compareClass;

	public WebElement getFirstCompareItem() {
		return firstCompareItem;
	}

	public WebElement getSecondCompareItem() {
		return secondCompareItem;
	}

	public WebElement getCompareItemsLink() {
		return compareItemsLink;
	}

	public WebElement getFirstCompareElement() {
		return firstCompareElement;
	}

	public WebElement getSecondCompareElement() {
		return secondCompareElement;
	}

	public WebElement getCompareGoods() {
		return compareGoods;
	}

	public WebElement getCompareClass() {
		return compareClass;
	}

}
