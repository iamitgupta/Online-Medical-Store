Feature: Customer login feature 




Scenario: customer login with valid credential 
	Given customer is on customerLogin page 
	When customer enter valid UserId and valid password 
	And click on Login button 
	Then customer should get navigated to customer home page 
	
	
	
	
	
Scenario: User is able to add products to cart 
	Given click on the element to be added 
	When click on add to cart button  
	Then the searched  product should be added to the cart 
          