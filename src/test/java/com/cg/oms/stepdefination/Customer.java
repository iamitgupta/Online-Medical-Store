package com.cg.oms.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Customer {
	
	
	static WebDriver driver;

	@Given("^customer is on customerLogin page$")
	public void customer_is_on_login_page()  {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/customerLogin");
		driver.manage().window().maximize();
		
	}
	

	@When("^customer enter valid UserId and valid password$")
	public void customer_enter_valid_UserId_and_valid_password()  {
		driver.findElement(By.name("customerId")).sendKeys("10");
		driver.findElement(By.id("password")).sendKeys("123");


	}
	@And("^click on Login button$")
	public void click_on_Login_button() {

		driver.findElement(By.xpath("//div/button[@class='btn btn-info float-right']")).click();


	}


	@Then("^customer should get navigated to customer home page$")
	public void customer_should_get_navigated_to_customer_home_page() throws InterruptedException  {
		Thread.sleep(3000);
	   
	}
	@Given("^search for the element to be added$")
	public void search_for_the_element_to_be_added() 
 {

 
 
 }
	@Given("^click on the element to be added$")
	public void click_on_the_element_to_be_added() throws Throwable {

		   //driver.findElement(By.className("btn btn-primary")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger btn-block mb-2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger btn-block mb-2']")).click();
		Thread.sleep(3000);
		

	
	}


	@When("^click on add to cart button$")
	public void click_on_add_to_cart_button() throws InterruptedException  {
		
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	
		driver.findElement(By.xpath("//button[@class='btn btn-danger navbar-btn']")).click();


	}

//	@Then("^product should be added in cart page$")
//	public void product_should_be_added_in_cart_page()  {
//	
//	  
//	}
	///@Then("^the searched  product should be added to the cart$")
//	public void the_searched_product_should_be_added_to_the_cart() throws Throwable {
	
		//driver.get("http://localhost:4200/cart");
	//	driver.findElement(By.xpath("//button[@class='btn btn-danger navbar-btn']")).click();

	//}
	
	


}
