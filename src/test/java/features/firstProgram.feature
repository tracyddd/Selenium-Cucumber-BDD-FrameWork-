Feature: Application Login
  Background:
   Given setup the entire in database
    When launch the browser from config variables
    And hit the home page url of banking site


  Scenario: Admin Page default login
    Given User is on NetBanking landing page
    When user login into application with "admin" and password "1234"
    Then Home Page is displayed.
    And Cards are displayed

    #Reuseble

  @SmokeTest
  Scenario: User Page Default Login
    Given User is on NetBanking landing page
    When user login into application with "user" and password "5678"
    Then Home Page is displayed.
    And Cards are displayed

    @Regression
  Scenario Outline: Mortgage User Page Default Login
    Given User is on NetBanking landing page
    When user login into application with "<Username>" and password <Password> combination
    Then Home Page is displayed.
    And Cards are displayed
    Examples:
    | Username | Password |
    | debituser | 111  |
    | credituser |222   |

  @Regression @SmokeTest #will run twice
  Scenario: User Page Default Sign up
    Given User is on Practise landing page
    When user signup into application
    |rahul|
    |shetty|
    |Contact@email.com|
    |416-111-1111|
    Then Home Page is displayed.
    And Cards are displayed