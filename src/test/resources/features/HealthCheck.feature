#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Myntra Shopping Website Check

  Background: navigation to url
    Given user navigated to home application url

  @tag1
  Scenario: search for product
    When search for "laptop"
    Then search product is displayed

  @tag2
  Scenario Outline: search for multiple products
    When user check for "<product_name>"
    Then search Result is displayed

    Examples: 
      | product_name |
      | mobile       |
      | phonecase    |
      | earphone     |
