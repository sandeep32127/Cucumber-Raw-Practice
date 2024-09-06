Feature: Checking the registration feature with data tables

Scenario: Verify the user registration procedure
Given User is on Registration page
And User enters the following details as list
|Sandeep|7978528487|ab@gmail.com   |10098|Dhenkanal|
|Bitto  |9566442717|bitto@gmail.com|45678|Ajmer    |
When User clicks on OK button
Then The registration should be successful


Scenario: Verify the user registration procedure
Given User is on Registration page
And User enters the following details as maps
|Name   |phnNum    |mailId         |Id   |City     |
|Sandeep|7978528487|ab@gmail.com   |10098|Dhenkanal|
|Bitto  |9566442717|bitto@gmail.com|45678|Ajmer    |
When User clicks on OK button
Then The registration should be successful

