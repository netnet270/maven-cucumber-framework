package bankguru.stepDefinitions;

import commons.PageGeneratorManager;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePageObject;

public class HomePageSteps {
  WebDriver driver;
  HomePageObject homePage;
  
  public HomePageSteps(){
    driver = Hooks.openAndQuitBrowser();
    homePage = PageGeneratorManager.getHomePageObject(driver);
  }
  
  @Then("^Verify Home page displayed with message: Welcome To Manager's Page of Guru99 Bank$")
  public void verifyHomePageDisplayedWithMessage(String arg1) {
    Assert.assertEquals(homePage.getLoginSuccessMessage(), "Welcome To Manager's Page of Guru99 Bank");
  }
}
