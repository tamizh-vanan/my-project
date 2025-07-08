Feature: Uploading the patient health documets

  Scenario Outline:Verify that patient can able to upload the document
  When user Enterss the username "<username>"
  And Enterss the "<password>" which we provided
  Then Clickk on the Submit button
    When User enter the "<UHID>"
    Then select the IP number
    Then Select the dategiven
    And select the fileType
    Then upload the file



    Examples:
      | UHID      | IPNO | username  |password |
      |  MMH150   |      | admin 	|   admin    |