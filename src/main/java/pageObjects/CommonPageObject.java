package pageObjects;

import commons.BasePages;
import org.openqa.selenium.WebDriver;
import pageUIs.BasePageUI;

public class CommonPageObject extends BasePages {
  WebDriver driver;
  
  public CommonPageObject(WebDriver driver) {
    this.driver = driver;
  }
  
  public void openManagerTabByText(WebDriver driver, String tabName) {
    waitForElementClickable(driver, BasePageUI.DYNAMIC_MANAGER_TAB_BY_TEXT, tabName);
    clickToElement(driver, BasePageUI.DYNAMIC_MANAGER_TAB_BY_TEXT, tabName);
  }
  
  public void enterToTextboxByLabel(WebDriver driver, String textboxLabel, String value) {
    if(textboxLabel.equals("Date of Birth")){
      removeAttributeInDOM(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_LABEL, "type", textboxLabel );
    }
    waitForElementVisible(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_LABEL, textboxLabel);
    senkeyToElement(driver, BasePageUI.DYNAMIC_TEXTBOX_BY_LABEL, value, textboxLabel);
  }
  
  public void enterToTextareaByLabel(WebDriver driver, String textareaLabel, String value) {
    waitForElementVisible(driver, BasePageUI.DYNAMIC_TEXTAREA_BY_LABEL, textareaLabel);
    senkeyToElement(driver, BasePageUI.DYNAMIC_TEXTAREA_BY_LABEL, value, textareaLabel);
  }
  
  public void clickToButtonByValue(WebDriver driver, String buttonValue) {
    waitForElementClickable(driver, BasePageUI.DYNAMIC_BUTTON_BY_VALUE, buttonValue);
    clickToElement(driver, BasePageUI.DYNAMIC_BUTTON_BY_VALUE, buttonValue);
  }
  
  public void selectToRadioButton(WebDriver driver, String radioButtonValue) {
    waitForElementClickable(driver, BasePageUI.RADIO_BUTTON, radioButtonValue);
    checkTheCheckboxOrRadio(driver, BasePageUI.RADIO_BUTTON, radioButtonValue);
  }
  
  public String getRowValueByRowName(WebDriver driver, String rowName) {
    waitForElementVisible(driver, BasePageUI.DYNAMIC_ROW_VALUE_BY_ROW_NAME, rowName);
    return getTextElement(driver, BasePageUI.DYNAMIC_ROW_VALUE_BY_ROW_NAME, rowName);
  }
  
  public boolean isDynamicMessageDisplayed(WebDriver driver, String expectedMessage) {
    return isElementDisplayed(driver, BasePageUI.DYNAMIC_MESSAGE_TABLE, expectedMessage);
  }
}
