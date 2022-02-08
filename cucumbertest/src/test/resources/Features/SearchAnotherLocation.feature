@Regression
Feature: To validate search for another contry/territory

  @SanityTest
  Scenario Outline: To validate customer is able to select another countr/territory
    Given I have navigated to FedEx
    When I click on search for another country or territory
    And I click on another country "<country>"
    Then I validate new country name "<country>"

    Examples: 
      | country      |
      | Burkina Faso |