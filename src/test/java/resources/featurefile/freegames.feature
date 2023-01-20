@Regression
Feature: Free Games Test
  As a user I want to click on free games link on homepage of Virgin games website

  Scenario: I can accept cookies
    Given I click on url
    When I accepted cookies
    Then I am on homepage
    And I click on free games link
    And I should navigate to free games page successfully