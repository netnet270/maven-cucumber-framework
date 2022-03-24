@register
Feature: REGISTER

  Scenario: Register to system
    Given Get Login Page Url
    When Open Register page
    And Enter to Email ID textbox with value "automation@mail.com"
    And Click to Submit button at Register page
    Then Get User ID text at Info table
    And Get Password text at Info table
    When Back to Login Page
