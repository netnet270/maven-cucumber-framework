package pageObjects;

import commons.BasePages;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPageUI;

public class LoginPageObject extends BasePages {
  WebDriver driver;
  
  public LoginPageObject(WebDriver driver) {
    this.driver = driver;
  }
  
  public HomePageObject loginToSystem(String userName, String password) {
    waitForElementVisible(driver, LoginPageUI.USERNAME_TEXTBOX);
    senkeyToElement(driver, LoginPageUI.USERNAME_TEXTBOX, userName);
    
    waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
    senkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
    
    waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
    clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    return PageGeneratorManager.getHomePageObject(driver);
  }
  
  public String getLoginPageUrl() {
    return getCurrentUrl(driver);
  }
  
  public void clickToHereLink() {
    waitForElementClickable(driver, LoginPageUI.HERE_LINK);
    clickToElement(driver, LoginPageUI.HERE_LINK);
  }
}