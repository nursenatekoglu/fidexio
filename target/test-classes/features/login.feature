Feature: Login functionality
  Agile story:
  1-Users can log in with valid credentials
  2-"Wrong login/password" should be displayed for invalid credentials
  3- "Please fill out this field" message should be displayed if the password or username is empty
  4-User land on the ‘reset password’ page after clicking on the "Reset password" link
  5-User should see the password in bullet signs by default
  6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page

  Scenario: Login with valid credentials verification
    When user inputs valid credentials
    Then user should log in

  Scenario: Wrong login message display verification
    When user inputs invalid credentials
    Then user should see "Wrong login/password" is displayed

  Scenario: Fill out message display verification
    When user does not put any password and username
    Then user should see "Please fill out this field" message is displayed

  Scenario: Password in bullet signs verification
    When user inputs password
    Then user should see the password in bullet signs by default

  Scenario: Enter key working correctly verification
    When user press ‘Enter’ on the login page
    Then user should see the ‘Enter’ key of the keyboard is working correctly


