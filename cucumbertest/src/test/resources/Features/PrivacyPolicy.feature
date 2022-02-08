@Regression
Feature: To validate privacy policy in FedEx website

  @SanityTest
  Scenario Outline: To validate privacy policyfunctionality
    Given I have navigated to FedEx
    When I select language and region 
    And I click on Accept Cookies
    And I click on privacy policy link
    Then I validate privacy page is opened with title "<title>"

    Examples: 
      | title       |
      | Privacy Policy |