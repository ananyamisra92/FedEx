@Regression
Feature: To validate shipment in FedEx website

  @SanityTest
  Scenario Outline: To validate shipment functionality
    Given I have navigated to FedEx
    When I select language and region
    And I click on Accept Cookies
    And I click on ship
    Then I validate sign up is displayed