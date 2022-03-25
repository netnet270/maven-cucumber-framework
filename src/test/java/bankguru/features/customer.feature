@customer
Feature: CUSTOMER

  @register
  Scenario: Register to system
    Given Get Login Page Url
    When Open Register page
    And Enter to "Email ID" textbox with value "automation@mail.com"
    And Click to "Submit" button
    Then Get User and Password text at Info table
    When Back to Login Page

  @login
  Scenario: Login to system
    When Enter to User ID textbox
    And Enter to Password textbox
    And Click to "Login" button
    Then Verify Home page displayed with message: Welcome To Manager's Page of Guru99 Bank

  @new_customer
  Scenario Outline: Create New Customer
    Given Open "New Customer" page
    When Enter to "Customer Name" textbox with value "<Name>"
    And Select to Gender radio button with value "m"
    And Enter to "Date of Birth" textbox with value "<DateOfBirthIn>"
    And Enter to "Address" textarea with value "<Address>"
    And Enter to "City" textbox with value "<City>"
    And Enter to "State" textbox with value "<State>"
    And Enter to "PIN" textbox with value "<Pin>"
    And Enter to "Mobile Number" textbox with value "<Phone>"
    And Enter to "E-mail" textbox with value "<Email>"
    And Enter to "Password" textbox with value "<Password>"
    And Click to "Submit" button
    And Verify message "<Message>" displayed success
    And Verify text displayed at "Customer Name" with value "<Name>"
    And Verify text displayed at "Gender" with value "<Gender>"
    And Verify text displayed at "Birthdate" with value "<DateOfBirthOut>"
    And Verify text displayed at "Address" with value "<Address>"
    And Verify text displayed at "City" with value "<City>"
    And Verify text displayed at "State" with value "<State>"
    And Verify text displayed at "Pin" with value "<Pin>"
    And Verify text displayed at "Mobile No." with value "<Phone>"
    And Verify text displayed at "Email" with value "<Email>"

    Examples: New Customer info
      | Name      | Gender | DateOfBirthIn | DateOfBirthOut | Address    | City        | State   | Pin    | Phone      | Email    | Password | Message                             |
      | Auto Test | male   | 01-01-1999    | 1999-01-01     | 123 Le Loi | Ho Chi Minh | Thu Duc | 123456 | 0987654321 | autotest | 123123   | Customer Registered Successfully!!! |
