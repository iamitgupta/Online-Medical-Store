Feature: Customer Register feature


Scenario: register customer 

	Given Customer is on register page
	When Customer enters information to register
	And click on submit button to register
	Then Customer should be navigate to add address page

