
Feature: Patient Registration


  Scenario Outline: Verify that Provider can able to Register the patient
  When user Enterss the username "<username>"
  And Enterss the "<password>" which we provided
  Then Clickk on the Submit button
    When Provider clicks on the Search button
    And Select the patient Demographics menu
    Then Enter the uhid "<UHID>"
    Then Select the Title from the Dropdown
    Then Enter the Firstname "<FirstName>"
    And Enter the Secondname "<SecondName>"
    Then Select the Gender from the dropdown
    Then Enter the <age>
    Then select the DOB from the calendar
    And Enter the Mobilenumber <MobileNumber>
    Then Enter the Address "<address>"
    And Enter the taluk "<Taluk>"
    Then Enter the cityname "<City>"
    And Enter the country name "<Country>"
    Then Click on the save button


    Examples:
   |username|password| UHID   | FirstName |SecondName|MobileNumber|address     |Taluk   |City    |Country|age|
   |admin   |admin   | MMH151 | jk    |rajan     |1111152685  |second road |Arcot   |chenna  |indi    |21|


