package pageObjects;

import commons.BasePages;
import org.openqa.selenium.WebDriver;
import pageUIs.RegisterPageUI;

public class RegisterPageObject  extends BasePages {
  WebDriver driver;
  
  public RegisterPageObject(WebDriver driver) {
    this.driver = driver;
  }
  
  public void openLoginPage(String pageUrl) {
    openPageUrl(driver, pageUrl);
  }
  
  public String getUserIDValueAtTable(WebDriver driver) {
    waitForElementVisible(driver, RegisterPageUI.USER_ID_VALUE_AT_INFO_TABLE);
    return getTextElement(driver, RegisterPageUI.USER_ID_VALUE_AT_INFO_TABLE);
  }
  
  public String getPasswordValueAtTable(WebDriver driver) {
    waitForElementVisible(driver, RegisterPageUI.PASSWORD_VALUE_AT_INFO_TABLE);
    return getTextElement(driver, RegisterPageUI.PASSWORD_VALUE_AT_INFO_TABLE);
  }
}