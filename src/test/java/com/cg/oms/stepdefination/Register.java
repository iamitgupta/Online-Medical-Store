package com.cg.oms.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {

	
	static WebDriver driver;
	
	
	
	@Given("^Customer is on register page$")
	public void customer_is_on_register_page() {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/register");
		driver.manage().window().maximize();
	   
	}

	@When("^Customer enters information to register$")
	public void customer_enters_information_to_register() {
		
		driver.findElement(By.id("userid")).sendKeys("10");
		driver.findElement(By.id("username")).sendKeys("Sharvari");
		driver.findElement(By.id("email")).sendKeys("sharvari@gmail.com");
		driver.findElement(By.id("moble")).sendKeys("9814324938");
		driver.findElement(By.id("age")).sendKeys("21");
		driver.findElement(By.id("gender")).sendKeys("Female");
		driver.findElement(By.id("password")).sendKeys("sharu");
		
		
	   
	}

	@When("^click on submit button to register$")
	public void click_on_submit_button_to_register() {
		
		driver.findElement(By.xpath("//button[.='Submit']")).click();
		
	    
	}

	
	@Then("^Customer should be navigate to add address page$")
	public void customer_should_be_navigate_to_add_address_page() {
	  
		System.out.println("User is on address page");
		driver.get("http://localhost:4200");

		//Thread.sleep(8000);
	}
}

	
	
//	
//	@Given("^customer is on customerLogin page$")
//	public void customer_is_on_login_page()  {
//		System.out.println("login page");
//		driver.get("http://localhost:4200/customerLogin");
//
//	}
//
//	@When("^customer enter valid UserId and valid password$")
//	public void customer_enter_valid_UserId_and_valid_password()  {
//		driver.findElement(By.name("customerId")).sendKeys("1");
//		driver.findElement(By.id("password")).sendKeys("123");
//
//
//	}
//	@And("^click on Login button$")
//	public void click_on_Login_button() {
//
//		driver.findElement(By.xpath("//div/button[@class='btn btn-info float-right']")).click();
//
//
//	}
//
//
//	@Then("^customer should get navigated to customer home page$")
//	public void customer_should_get_navigated_to_customer_home_page() throws InterruptedException  {
//		Thread.sleep(3000);
//	   
//	}
////	@Given("^user is on customerHome page$")
////	public void user_is_on_customerHome_page()  {
////		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
////		driver = new ChromeDriver();
////		driver.get("http://localhost:4200/customerLogin");
////		driver.manage().window().maximize();
////	   
////	}
//	@Given("^click on the element to be added$")
//	public void click_on_the_element_to_be_added() 
// {
//		
//	}
//
//	@When("^click on add to cart button$")
//	public void click_on_add_to_cart_button()  {
//		driver.findElement(By.xpath("//button[ .='Add To Cart']")).click();
//
////		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//	}
//
//	@Then("^product should be added in cart page$")
//	public void product_should_be_added_in_cart_page()  {
//	
//	  
//	}
//	@Then("^the searched  product should be added to the cart$")
//	public void the_searched_product_should_be_added_to_the_cart()  {
//		
//		driver.findElement(By.className("//div/form/button/i[@class='fa fa-shopping-cart']")).click();
//	}
//
//	
//	
//	
//	
//	
//	
//	
//
//}
