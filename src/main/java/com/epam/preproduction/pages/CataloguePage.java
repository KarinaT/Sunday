package com.epam.preproduction.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.epam.preproduction.components.CompareBlock;
import com.epam.preproduction.components.FiltersBlock;
import com.epam.preproduction.components.MainBlock;
import com.epam.preproduction.components.NavigationLine;
import com.epam.preproduction.components.SortingLine;
import com.epam.preproduction.entities.AirConditioner;
import com.epam.preproduction.entities.BreadMaker;
import com.epam.preproduction.entities.Item;
import com.epam.preproduction.entities.Microwave;

public class CataloguePage extends Page {

	// ==== COMPONENTS ==== //

	private SortingLine sortLineBlock;
	private MainBlock mainBlock;
	private FiltersBlock filterBlock;
	private NavigationLine navigationBlock;

	public CataloguePage(WebDriver driver) {
		super(driver);

		initiateComponents(driver);
	}

	private void initiateComponents(WebDriver driver) {
		this.sortLineBlock = PageFactory.initElements(driver, SortingLine.class);
		this.mainBlock = PageFactory.initElements(driver, MainBlock.class);
		this.navigationBlock = PageFactory.initElements(driver, NavigationLine.class);
	}

	// ==== GETTERS ==== //

	public SortingLine getSortLineBlock() {
		return sortLineBlock;
	}

	public MainBlock getMainBlock() {
		return mainBlock;
	}

	public FiltersBlock getFilterBlock() {
		return filterBlock;
	}

	public NavigationLine getNavigationBlock() {
		return navigationBlock;
	}

	// ==== GETTING PRODUCT TYPE, CATEGORY ==== //

	public void selectItemCategory(String categoryName) {
		driver.findElement(By.linkText(categoryName)).click();
	}

	public CataloguePage selectProductType(String productType) {
		
		//driver.findElement(By.xpath("//a[contains(text(),'"+ productType+ "')]")).click();
		driver.findElement(By.linkText(productType)).click();
		return PageFactory.initElements(driver, CataloguePage.class);
		
	}

	private List<String> getAllManufacturesFromFilter() {
		List<String> result = new ArrayList<String>();
		List<WebElement> manufactures = getDriver()
				.findElements(
						By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[1]/div/div[2]/div[5]/div[2]/a[@class=' active']"));
		System.out.println(manufactures);
		for (WebElement manufacture : manufactures) {
			result.add(manufacture.getText());
		}

		getDriver()
				.findElement(
						By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[1]/div/div[2]/div[5]/div[2]/a[17]"))
				.click();
		List<WebElement> hiddenManufactures = getDriver()
				.findElements(
						By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[1]/div/div[2]/div[5]/div[2]/div[3]/a[@class=' active']"));
		System.out.println(hiddenManufactures);
		for (WebElement manufacture : hiddenManufactures) {
			result.add(manufacture.getText());
		}
		return result;

	}
	// /6th test

	// public void verifyItemDescription() {
	// List<Item> catItems = new ArrayList<Item>();
	// // надо попасть на каталожну стр
	// List<WebElement> manufactures = driver
	// .findElements(By
	// .xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[2]/div/div[3]/div[3]"));
	// for (int i = 0; i < 5; i++) {
	// Item item = new AirConditioner();
	// item.setName(manufactures
	// .get(i)
	// .findElement(
	// By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[2]/div/div[3]/div[3]/div[1]"))
	// .getText());
	// item.setDescription(manufactures
	// .get(i)
	// .findElement(
	// By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[2]/div/div[3]/div[3]/div[3]"))
	// .getText());
	// catItems.add(item);
	//
	// // надо пройтись по карточкам
	// driver.findElement(
	// By.xpath("//*[@id='page-content-wrap']/div[3]/div[1]/div[2]/div/div[3]/div[3]/div[1]/a"))
	// .click();
	//
	// }
	// List<Item> items = new ArrayList<Item>();
	//
	// }

}
