package com.epam.preproduction.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.epam.preproduction.components.CompareBlock;

public class MainPage extends Page {
	
	private CompareBlock compareBlock;

	public MainPage(WebDriver driver, CompareBlock compareBlock) {
		super(driver);
		this.compareBlock = compareBlock;
	}

	public CompareBlock getCompareBlock() {
		return compareBlock;
	}





}