Feature: Add Customer Scenario.

  Scenario: Title of your scenario
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And user enters Email as "admin@yourstore.com" and password as "admin"
    And clicks on Login
    Then User can view Dashboard
    When User click on Customer menu
    And User click on customer Menu item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on Save button
    Then User can view confirmation message "The new customer has been added successfully."
    And close Browser

  @regression
  Scenario: Search Customer by Email
    When User click on Customer menu
    And User click on customer Menu item
    And Enter customer Email
    When Click on search button
    Then User should found Email in the Search table
    And close Browser
    
    


