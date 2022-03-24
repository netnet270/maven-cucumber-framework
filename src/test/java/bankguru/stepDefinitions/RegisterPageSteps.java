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
  
  @When("^Enter to Email ID textbox with value \"([^\"]*)\"$")
  public void enterToEmailIDTextboxWithValue(String email) {
    registerPage.enterToTextboxByLabel(driver, "Email ID", email);
  }
  
  @When("^Click to Submit button at Register page$")
  public void clickToSubmitButtonAtRegisterPage() {
    registerPage.clickToButtonByValue(driver, "Submit");
  }
  
  @Then("^Get User ID text at Info table$")
  public void getUserIDTextAtInfoTable() {
    registerPage.getRowValueByRowName(driver, "User ID :");
  }
  
  @Then("^Get Password text at Info table$")
  public void getPasswordTextAtInfoTable() {
    registerPage.getRowValueByRowName(driver, "Password :");
  }
  
  @When("^Back to Login Page$")
  public void backToLoginPage() {
    registerPage.openLoginPage(LoginPageSteps.loginPageUrl);
  }
}
