package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageGeneratorManager {
  public static LoginPageObject getLoginPageObject(WebDriver driver){
    return new LoginPageObject(driver);
  }
  
  public static RegisterPageObject getRegisterPageObject(WebDriver driver){
    return new RegisterPageObject(driver);
  }
  
  public static HomePageObject getHomePageObject(WebDriver driver){
    return new HomePageObject(driver);
  }
  
  public static NewCustomerPageObject getNewCustomerPageObject(WebDriver driver){
    return new NewCustomerPageObject(driver);
  }
  
  public static CommonPageObject getCommonPageObject(WebDriver driver){
    return new CommonPageObject(driver);
  }
}