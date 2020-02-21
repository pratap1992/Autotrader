package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

/**
 * @author
 *
 * 		This class will store all the locator and methods of login page
 *
 */
public class AdvanceSearchPage {

	WebDriver driver;

	public AdvanceSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//*[text()='Advanced Search']")
	@CacheLookup
	WebElement AdvancedSearch;

	// Find By in different ways of using
	@FindBy(xpath = "//input[@type='tel'][@name='zip']")
	@CacheLookup
	WebElement Zip;

	@FindBy(xpath = "//div[@class='input-label'][text()='Certified']")
	@CacheLookup
	WebElement Certified;

	@FindBy(xpath = "//div[@class='input-label'][text()='Convertible']")
	@CacheLookup
	WebElement Convertible;

	@FindBy(xpath = "//*[@id='4101482096']/option[37]")
	@CacheLookup
	WebElement Fromyear;

	@FindBy(xpath = "//*[@id='258002540']/option[4]")
	@CacheLookup
	WebElement Toyear;

	@FindBy(xpath = "//*[@id='1970425032']/option[8]")
	@CacheLookup
	WebElement BMW;

	@FindBy(xpath = "//*[@id='mountNode']/div/div[1]/div/div/div[1]/form/div[15]/div/div/button")
	@CacheLookup
	WebElement Search;

	@FindBy(xpath = "//*[@id='mountNode']/div/div[2]/div[1]/div/div[3]/div[1]/h1")
	@CacheLookup
	WebElement BMWcars;

	@FindBy(xpath = "//*[@class='results-text-container text-size-200'][text()='1-13 of 13 Results']")
	@CacheLookup
	WebElement Totalcars;

	@FindBy(xpath = "//*[@id='mountNode']/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[4]/div/div[2]")
	@CacheLookup
	WebElement Total;

	public void Advancepage_actions() throws InterruptedException {
		Highlight_Element(driver, AdvancedSearch);
		AdvancedSearch.click();
		Assert.assertEquals(true, AdvancedSearch.isDisplayed());
		System.out.println("AdvancedSearch Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, Zip);
		Zip.clear();
		Zip.sendKeys("30004");
		Assert.assertEquals(true, Zip.isDisplayed());
		System.out.println("Zip Assert Passed");
		Thread.sleep(5000);

		Highlight_Element(driver, Certified);
		Certified.click();
		Assert.assertEquals(true, Certified.isDisplayed());
		System.out.println("Certified Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, Convertible);
		Convertible.click();
		Assert.assertEquals(true, Convertible.isDisplayed());
		System.out.println("Convertible Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, Fromyear);
		Fromyear.click();
		Assert.assertEquals(true, Fromyear.isDisplayed());
		// Fromyear.selectByVisibleText("2017");
		// Assert.assertEquals(true,year.isDisplayed());
		System.out.println("From Year Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, Toyear);
		Toyear.click();
		Assert.assertEquals(true, Toyear.isDisplayed());
		// Toyear.selectByVisibleText("2020");
		// Assert.assertEquals(true,year.isDisplayed());
		System.out.println("To Year Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, BMW);
		BMW.click();
		Assert.assertEquals(true, BMW.isDisplayed());
		// Toyear.selectByVisibleText("BMW");
		// Assert.assertEquals(true,year.isDisplayed());
		System.out.println("BMW Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, Search);
		Search.click();
		Assert.assertEquals(true, Search.isDisplayed());
		System.out.println("Search Assert Passed");
		Thread.sleep(3000);

		Highlight_Element(driver, BMWcars);
		System.out.println("Total Log Count :" + BMWcars.getText());
		Assert.assertEquals(true, BMWcars.isDisplayed());
		System.out.println("BMWcars Assert Passed");
		Thread.sleep(3000);
		
		Highlight_Element(driver, Totalcars);
		System.out.println("Totalcars Log Count :" + Totalcars.getText());
		Assert.assertEquals(true, Totalcars.isDisplayed());
		System.out.println("Totalcars Assert Passed");
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
