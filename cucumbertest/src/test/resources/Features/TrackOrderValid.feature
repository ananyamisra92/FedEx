@Regression
Feature: To validate FedEx website

  @SanityTest
  Scenario Outline: To validate no error displayed for valid tracking ID
    Given I have navigated to FedEx
    When I select language and region
    And I click on Accept Cookies
    And I enter tracking ID "<ID1>"
    And I click Enter
    And I click Tracking Link
    And I click on LastOrder
    Then I validate the  Delivery message "<message>"

    Examples: 
      | ID1          | message |
      | 123456789012 |  Pending |
