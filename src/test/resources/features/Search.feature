Feature: Amazon Search Feature

@Smoke
Scenario: Verifying Amazon Search Page
Given User is on the Amazon home page
And Uer enters "iPhone" in Amazon Search Box
Then User gets displayed with "iPhone" having INR 25000

@Regression @Smoke
Scenario: Verifying Flipkart Search Page
Given User is on the Amazon home page
And Uer enters "Tab" in Amazon Search Box
Then User gets displayed with "Tab" having INR 2000

@Sanity
Scenario: Verifying Myntra Search Page
Given User is on the Amazon home page
And Uer enters "Dress" in Amazon Search Box
Then User gets displayed with "Dress" having INR 20000