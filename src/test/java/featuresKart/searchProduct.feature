Feature: Search and Place the order for Products
#  Background:
#    Given setup the entire in database
#    When launch the browser from config variables
#    And hit the home page url of banking site

@kart
  Scenario: Search Experience for product search in both home and Offers page
    Given User is on GreenCart landing page
    When user searched with Shortname "Tom" and extracted actual name of product
    Then User searched for "Tom" shortname in offers page
    And validate product name in offers page matches with Landing page