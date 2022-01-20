@productSettings
Feature: Product Settings test case

  Scenario:UAT_ Supply chain_ Inner tube_ Create product_ 0001
    Given logon "environments_1" on tube by inputting system
    When  I click produrt
    When   I click on Product List
    Then click Create Product
    Then enter the page information
    Then click Submit to submit a new product

