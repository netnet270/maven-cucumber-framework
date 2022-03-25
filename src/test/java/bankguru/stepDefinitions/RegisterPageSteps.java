package bankguru.stepDefinitions;

import commons.PageGeneratorManager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.openqa.selenium.WebDriver;
import pageObjects.NewCustomerPageObject;
import pageObjects.RegisterPageObject;

public class RegisterPageSteps {
  WebDriver driver;
  static String userID, password;
  RegisterPageObject registerPage;
  
  public RegisterPageSteps(){
    driver = Hooks.openAndQuitBrowser();
    registerPage = PageGeneratorManager.getRegisterPageObject(driver);
  }
  
  @Then("^Get User and Password text at Info table$")
  public void getUserAndPasswordTextAtInfoTable() {
    userID = registerPage.getUserIDValueAtTable(driver);
    password = registerPage.getPasswordValueAtTable(driver);
  }
  
  @When("^Back to Login Page$")
  public void backToLoginPage() {
    registerPage.openLoginPage(LoginPageSteps.loginPageUrl);
  }
}
