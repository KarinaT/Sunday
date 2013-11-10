package com.epam.preproduction.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortingLine extends Components{	

	public SortingLine() {
		super();
	}

	public static final String SORT_PRICE = "//a[contains(@href,'sort=pricee')]";
	public static final String SORT_NAME = "//div[@class='order']/a[contains(@href,'sort=name')]";

	@FindBy(xpath = SORT_PRICE)
	private WebElement sortPrice;
	
	@FindBy(xpath = SORT_NAME)
	private WebElement sortName;
	

//	public WebElement getSortName() {
//		return sortName;
//	}
//
//	public WebElement getSortPrice() {
//		return sortPrice;
//	}
	
	public void sortByPrice(){
		sortPrice.click();
	}
	
	public void sortByName(){
		sortName.click();
	}

	

}
