package bankguru.stepDefinitions;

import commons.PageGeneratorManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.CommonPageObject;

public class CommonPageSteps {
  WebDriver driver;
  CommonPageObject commonPage;
  
  public CommonPageSteps() {
    driver = Hooks.openAndQuitBrowser();
    commonPage = PageGeneratorManager.getCommonPageObject(driver);
  }
  
  @Given("^Open \"([^\"]*)\" page$")
  public void openPage(String pageName) {
    commonPage.openManagerTabByText(driver, "New Customer");
  }
  
  @When("^Enter to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
  public void enterToTextboxWithValue(String fieldName, String enterValue) {
    commonPage.enterToTextboxByLabel(driver, fieldName, enterValue);
  }
  
  @When("^Select to Gender radio button with value \"([^\"]*)\"$")
  public void selectToRadioButtonWithValue(String radioButtonValue) {
    commonPage.selectToRadioButton(driver, radioButtonValue);
  }
  
  @When("^Enter to \"([^\"]*)\" textarea with value \"([^\"]*)\"$")
  public void enterToTextareaWithValue(String fieldName, String enterValue) {
    commonPage.enterToTextareaByLabel(driver, fieldName, enterValue);
  }
  
  @When("^Click to \"([^\"]*)\" button$")
  public void clickToButton(String buttonValue) {
    commonPage.clickToButtonByValue(driver, buttonValue);
  }
  
  @Then("^Verify message \"([^\"]*)\" displayed success$")
  public void verifyMessageDisplayedSuccess(String expectedMessage) {
    commonPage.isDynamicMessageDisplayed(driver, expectedMessage);
  }
  
  @Then("^Verify text displayed at \"([^\"]*)\" with value \"([^\"]*)\"$")
  public void verifyTextDisplayedAtWithValue(String rowName, String expectedValue) {
    Assert.assertEquals(commonPage.getRowValueByRowName(driver, rowName), expectedValue);
  }
}
