package com.epam.preproduction.components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainBlock extends Components {

	public static final String BASE_URL = "http://pn.com.ua";

	private static final String ITEM_NAME = "name";
	private static final String ITEM_PRICE = "price";
	public static final String DIV_CLASS_ITEM = ".//div[@class='item']";
	public static final String DIV_CLASS_NAME = ".//div[@class='name']/a";
	private static final String PRICE_STRONG = ".//div[@class='price']/strong";
	public static final String CLASS_DESCRIPTION = ".//div[@class='description']";
	public static final String NEXT_PAGE = "pager-next";

	public static final String ACTIVE_NEXT_LINK = "active";

	@FindBy(className = ITEM_NAME)
	WebElement productNames;

	@FindBy(className = ITEM_PRICE)
	WebElement productPrices;

	@FindBy(xpath = PRICE_STRONG)
	WebElement priceStrong;

	@FindBy(xpath = DIV_CLASS_ITEM)
	List<WebElement> divClassItem;

	@FindBy(xpath = DIV_CLASS_NAME)
	List<WebElement> divClassName;

	@FindBy(className = NEXT_PAGE)
	WebElement nextPage;

	public WebElement getProductNames() {
		return productNames;
	}

	public WebElement getProductPrices() {
		return productPrices;
	}

	public List<WebElement> getDivClassName() {
		return divClassName;
	}

	public List<WebElement> getDivClassItem() {
		// return getWebrdiver().findElements(By.xpath(DIV_CLASS_ITEM));
		return divClassItem;
	}

	public WebElement getNextPage() {
		return nextPage;
	}

}
