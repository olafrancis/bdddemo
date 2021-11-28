Feature: Investmant Calculator Functionality 
 
Scenario: Investment check 
	Given a chrome browser is launch   
	When user enter principal amount 
	When user enter interest rate 
	When user enter investment term 
	When user select period 
	And user click the calculate button
	Then user sees the calculation result
	And user closed the browser 