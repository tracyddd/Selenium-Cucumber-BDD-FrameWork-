Feature: Search and Place the order for Products
#  Background:
#    Given setup the entire in database
#    When launch the browser from config variables
#    And hit the home page url of banking site

@kart
  Scenario Outline: Search Experience for product search in both home and Offers page
    Given User is on GreenCart landing page
    When User searched with Shortname <Name> and extracted actual name of product
    Then User searched for <Name> shortname in offers page
    And Validate product name in offers page matches with Landing page
  Examples:
    |Name  |
    |"Tom"|
    |"Ban"|
    |"Beet"|