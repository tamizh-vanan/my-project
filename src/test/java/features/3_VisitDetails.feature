Feature: Patient Visit details
@visit
  Scenario Outline: Verify that User create the Visit details
    When user Enterss the username "<username>"
    And Enterss the "<password>" which we provided
    Then Clickk on the Submit button
    When Provider clicks on the Search button
    And Select the patient Visit details menu
    Then Enter thee uhid "<UHID>"
    Then Select the Visit Type
    Then Select the Visit Date
    And Select the Doctor's name
    Then Click on the save buttonn

    Examples:
      |username|password|UHID   |
      |admin   |admin   |MMH150 |

    