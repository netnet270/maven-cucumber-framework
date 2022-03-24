package pageObjects;

import commons.BasePages;
import org.openqa.selenium.WebDriver;

public class RegisterPageObject  extends BasePages {
  WebDriver driver;
  
  public RegisterPageObject(WebDriver driver) {
    this.driver = driver;
  }
  
  public void openLoginPage(String pageUrl) {
    openPageUrl(driver, pageUrl);
  }
}