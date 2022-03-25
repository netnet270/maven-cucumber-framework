package pageObjects;

import commons.BasePages;
import org.openqa.selenium.WebDriver;
import pageUIs.HomePageUI;

public class HomePageObject extends BasePages {
  WebDriver driver;
  
  public HomePageObject(WebDriver driver) {
    this.driver = driver;
  }
  
  public String getLoginSuccessMessage() {
    waitForElementVisible(driver, HomePageUI.LOGIN_SUCCESS_MESSAGE);
    return getTextElement(driver, HomePageUI.LOGIN_SUCCESS_MESSAGE);
  }
}