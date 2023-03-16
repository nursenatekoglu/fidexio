Feature: Login functionality
  Agile story:
  1-Users can log in with valid credentials
  2-"Wrong login/password" should be displayed for invalid credentials
  3- "Please fill out this field" message should be displayed if the password or username is empty
  4-User land on the ‘reset password’ page after clicking on the "Reset password" link
  5-User should see the password in bullet signs by default
  6- Verify if the ‘Enter’ key of the keyboard is working correctly on the login page

  Background: Login page
    Given User is on the login page


  Scenario Outline: Login with valid credentials verification
    When user inputs an email "<email>"
    And user inputs a password "<password>"
    And user clicks login button
    Then user should be on the homepage
    Examples: valid credentials
      | email                   | password     |
      | salesmanager44@info.com | salesmanager |
      | salesmanager7@info.com  | salesmanager |
      | posmanager44@info.com   | posmanager   |
      | posmanager51@info.com   | posmanager   |


  Scenario Outline: Wrong login message display verification
    When User inputs an email "<email>"
    And User inputs a password "<password>"
    And User clicks login button
    Then user should see "Wrong login/password" is displayed
    Examples: invalid Credentials
      | email                    | password     |
      | salesmanage6@info.com    | salesmanager |
      | salesmanager100@info.com | salesmanage  |
      | posmanager1@info.com     | posmanager   |
      | posmanager100@info.com   | pomanager    |

@wip
  Scenario Outline: Fill out message display verification
    When User inputs an email "<email>"
    And User inputs a password "<password>"
    And User clicks login button
    Then user should see "Please fill in this field" message is displayed
    Examples: Credentials
      | email                 | password     |
      | posmanager99@info.com |              |
      |                       | salesmanager |


  Scenario: Password in bullet signs verification
    When user inputs password "salesmanager"
    Then user should see the password in bullet signs by default


  Scenario: ‘Enter’ key of the keyboard is working correctly on the login page
    When User inputs an email "salesmanager8@info.com"
    And User inputs a password "salesmanager"
    And User presses enter key
    Then User should be on the homepage

