/**
 * 
 */
package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.AdvanceSearchPage;
import POM.HomePO;

public class Homepage {

	static WebDriver driver;

	@BeforeTest

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\neela\\sample\\Chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.autotrader.com/");
		driver.manage().window().maximize();
		System.out.println("launching Chrome browser");
	}

	@Test(priority = 0, description = "Enter the into App, verify that following types of elements are present")
	public void HomePO_actions() throws InterruptedException {
		HomePO home = PageFactory.initElements(driver, HomePO.class);
		home.Homepage_actions();
	}

	@Test(priority = 1, description = "After entering to Advance Search page,verify that following types of elements are present and COUNT the total number of cars/listing you see in the results")
	public void AdvanceSearchPO_action() throws InterruptedException {
		AdvanceSearchPage search = PageFactory.initElements(driver, AdvanceSearchPage.class);
		search.Advancepage_actions();

	}

	@AfterTest
	public void Closebrowser() {
		driver.close();
		System.out.println("After Test");
	}
}
