Feature: Adding the health records to the patient


    Scenario Outline: Verify that patient can able to add the health records
   When user Enters the usernamee "<username>"
   And Enters the "<password>" which we providedd
   Then Click on the Submitt button
   When The user Click on the Health summary menu
   And Click on the Medication menu
   Then Enter the "<UHID>" AND "<MedicationName>"
   Then Enter the <HowMany> and <Dosage>
   Then Enter thee <Frequency>
   And Enter the status
   Then select the DateTaken
   Then select the StartDate
   And Select the EndDate
    And Click on save



   Examples:
     |username|password|UHID   |MedicationName|HowMany|Dosage|Frequency|
     |admin   |admin   |MMH150 | Dolo 650      | 3      |2     |2        |
