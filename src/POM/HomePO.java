/**
 * 
 */
package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * @author
 *
 * 		This class will store all the locator and methods of login page
 *
 */
public class HomePO {

	WebDriver driver;

	public HomePO(WebDriver driver) {
		this.driver = driver;
	}

	// Find By in different ways of using
	@FindBy(xpath = "//*[text()='Browse by Make']")
	@CacheLookup
	WebElement BrowsebyMake;

	@FindBy(xpath = "//*[@title='Browse by Style'][text()='Browse by Style']")
	@CacheLookup
	WebElement BrowsebyStyle;

	@FindBy(xpath = "//*[text()='Advanced Search']")
	@CacheLookup
	WebElement AdvancedSearch;

	@FindBy(xpath = "//*[@id='search']")
	@CacheLookup
	WebElement search;

	@FindBy(xpath = "//*[@name='makeCodeListPlaceHolder']")
	@CacheLookup
	WebElement Make;

	@FindBy(xpath = "//*[@name='modelCodeListPlaceHolder']")
	@CacheLookup
	WebElement Model;

	public void Homepage_actions() throws InterruptedException {
		Highlight_Element(driver, BrowsebyMake);
		Assert.assertEquals(true, BrowsebyMake.isDisplayed());
		System.out.println("BrowserbyMake Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, BrowsebyStyle);
		Assert.assertEquals(true, BrowsebyStyle.isDisplayed());
		System.out.println("BrowsebyStyle Assert Passed");
		Thread.sleep(3000);

		 Highlight_Element(driver, AdvancedSearch);
		 Assert.assertEquals(true, AdvancedSearch.isDisplayed());
		 System.out.println("AdvancedSearch Assert Passed");
		 Thread.sleep(3000);

		Highlight_Element(driver, search);
		Assert.assertEquals(true, search.isDisplayed());
		System.out.println("Search Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, Make);
		Assert.assertEquals(true, Make.isDisplayed());
		System.out.println("Make Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, Model);
		Assert.assertEquals(true, Model.isDisplayed());
		System.out.println("Model Assert Passed");
		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	// Web-elements highlight code
	public static void Highlight_Element(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background:; border: 2px solid red;');", element);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", element);

	}

}
