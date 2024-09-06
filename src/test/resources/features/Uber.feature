Feature: Verifying Uber Cab
         User can select Sedan
         User can select SUV
         user can select hatchback
         
Background:
Given User launches Uber App
And User enters login creds
And User lands on home page
Then User selects destination         
         
Scenario: User selects Sedan
Then User selects "Sedan" for trip A

Scenario: User selects SUV
Then User selects "SUV" for trip B

Scenario: User selects hatchback
Then User selects "hatchback" for trip C 
                   