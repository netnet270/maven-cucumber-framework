package bankguru.stepDefinitions;

import commons.PageGeneratorManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPageObject;

public class LoginPageSteps {
  WebDriver driver;
  static String loginPageUrl;
  LoginPageObject loginPage;
  
  public LoginPageSteps() {
    driver = Hooks.openAndQuitBrowser();
    loginPage = PageGeneratorManager.getLoginPageObject(driver);
  }
  
  @Given("^Get Login Page Url$")
  public void getLoginPageUrl() {
    loginPageUrl = loginPage.getLoginPageUrl();
  }
  
  @When("^Open Register page$")
  public void openRegisterPage() {
    loginPage.clickToHereLink();
  }

  @When("^Enter to User ID textbox$")
  public void enterToUserIDTextbox() {
    loginPage.enterToTextboxByLabel(driver, "UserID", RegisterPageSteps.userID);
  }
  
  @When("^Enter to Password textbox$")
  public void enterToPasswordTextbox() {
    loginPage.enterToTextboxByLabel(driver, "Password", RegisterPageSteps.password);
  }
}
