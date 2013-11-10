package com.epam.preproduction.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.epam.preproduction.configuration.DataProviderLayer;
import com.epam.preproduction.pages.CataloguePage;
<<<<<<< HEAD
import com.epam.preproduction.pages.MainPage;
=======
import com.epam.preproduction.pages.ItemPage;
>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24
import com.epam.preproduction.pages.PricePage;

public class AirConditionerTest extends TestBase {



	@Test(dataProvider = "readFromExcel", dataProviderClass = DataProviderLayer.class)
	public void testAirConditioner(String categoryName, String productType)
			throws Exception {

		goToMainPage();
		driver.findElement(By.linkText(productType)).click();

		PricePage pricePage = new PricePage(driver);
		pricePage.verifyItemLinksAreEqual();

		CataloguePage cataloguePage = PageFactory.initElements(driver,
				CataloguePage.class);
<<<<<<< HEAD
		//cataloguePage.verifyItemDescription();
	}
=======
		AirConditioner airConditioner = new AirConditioner();
		PricePage pricePage = new PricePage(driver);
		pricePage.verifyItemLinksAreEqual();

	}


>>>>>>> d2feea4cb1bfa9b9dd8534db3098a85a86a8ed24

}
