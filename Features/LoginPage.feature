Feature: Login

  Scenario: Sucessfull Login with valid credentials
    Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And user enters Email as "admin@yourstore.com" and password as "admin"
    And clicks on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page title should be "Your store. Login"
    And close Browser
    
  Scenario Outline: Sucessful login with valid credentials DDT
   	Given User Launch Chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/loginm"
    And user enters Email as "<email>" and password as "<password>"
    And clicks on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page title should be "Your store. Login"
    And close Browser
    
	Examples:
	|email|password|
	|admin@yourstore.com|admin|
	|test@yourstore.com|admin|

   