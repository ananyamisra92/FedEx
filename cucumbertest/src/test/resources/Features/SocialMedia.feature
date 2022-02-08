@Regression
Feature: To validate social media options are displayed in FedEx website

  @SanityTest
  Scenario Outline: To validate social media options
    Given I have navigated to FedEx
    When I select language and region
    And I click on Accept Cookies
    Then I validate Facebook option is displayed