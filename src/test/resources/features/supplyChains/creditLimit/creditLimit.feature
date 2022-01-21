@creditLimit
Feature: test creditLimit

  Scenario:The operator initiated Buyer Entity Flow & Buyer Entity Public to grant credit to buyer customers, and the credit was successfully granted, and the limit and rating were obtained
    Given logon "environments_1" on tube by inputting system
    When I click UnderWriting and UnderWriting Approval
    Then I should direct to the UnderWriting Approval page
    When I click buyer Assign to Me button on UnderWriting Approval page
    When I click Assign to ME title on the on UnderWriting Approval page
    Then I should see Proceed Button on the UnderWriting Approval page
    When I click Completed Button on the UnderWriting Approval page