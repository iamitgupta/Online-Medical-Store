package com.cg.oms.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Admin {


	static WebDriver driver;


	@Given("^Admin is on login page$")
	public void admin_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:4200/login");
		driver.manage().window().maximize();
	}




	@When("^Admin enter valid AdminId and valid password$")
	public void admin_enter_valid_AdminId_and_valid_password()  {
		driver.findElement(By.name("adminId")).sendKeys("100");
		driver.findElement(By.id("password")).sendKeys("admin");


	}
	
	
   
	@When("^click on login button$")
	public void click_on_login_button() {

		driver.findElement(By.xpath("//div/button[@class='btn  btn-info float-right']")).click();


	}

	@Then("^admin should get navigated to admin home page$")
	public void admin_should_get_navigated_to_admin_home_page()   {
		driver.get("http://localhost:4200/adminhome");

	}

	

	@When("^Admin clicks on link search product by name$")
	public void admin_clicks_on_link_search_product_by_name(){

	driver.findElement(By.xpath(("//a[@href='/searchproductbykey']"))).click();
	
	}
	
	@When("^On search product page enters the product name$")
	public void on_search_product_page_enters_the_product_name()  {
		driver.findElement(By.name("productname")).sendKeys("vic");

	}

	@When("^click on search product button$")
	public void click_on_search_product_button(){

		driver.findElement(By.xpath("//div/button[@class='btn btn-primary float-right']")).click();

	
	}

	@Then("^It should show the product for that name$")
	public void it_should_show_the_product_for_that_name() throws InterruptedException{
		driver.findElement(By.xpath("//div/button[@class='table table-bordered']")).click();
Thread.sleep(4000);
	
	}

	
	
	
	@When("^Admin clicks on link search product by id$")
	public void admin_clicks_on_link_search_product_by_id() throws Throwable {
		driver.findElement(By.xpath(("//a[@href='/searchproduct']"))).click();
	Thread.sleep(1000);
	}
	

	@When("^On search product page enters the product id$")
	public void on_search_product_page_enters_the_product_id()  {
		driver.findElement(By.name("productId")).sendKeys("1");

	
	}
	

	@Then("^It should show the product of that id$")
	public void it_should_show_the_product_of_that_id() throws Throwable {

//		driver.findElement(By.xpath("//div/table[@class='table table-bordered']").

	Thread.sleep(3000);
	}

	
	@When("^Admin clicks on link Get All Customers$")
	public void admin_clicks_on_link_Get_All_Customers() {

		driver.findElement(By.xpath(("//a[@href='/getAllCustomers']"))).click();

	}

	
	
	@Then("^It should show all the list of Customers with details$")
	public void it_should_show_all_the_list_of_Customers_with_details() {

	driver.findElement(By.xpath("table table-bordered"));
	
	}

	@Then("^If we want to remove the user then click on remove button$")
	public void if_we_want_to_remove_the_user_then_click_on_remove_button(){

	driver.findElement(By.xpath("//div/button[@class='btn btn-danger']")).click();
	driver.close();
	}

	
	// valid get all product 
	
		@When("^Admin clicks on get all product link$")
		public void admin_clicks_on_get_all_product_link() throws Throwable {
			Thread.sleep(4000);
			driver.findElement(By.linkText("Get All Products")).click();
			
		}

		@Then("^It should show all the product$")
		public void it_should_show_all_the_product() throws Throwable {
			System.out.println("Get all Product");
			driver.findElement(By.xpath("//table[@class='table table-bordered']"));
			Thread.sleep(6000);
		}
		
		// valid add product 
		@When("^Admin clicks on add product link$")
		public void admin_clicks_on_add_product_link() throws Throwable {
			driver.findElement(By.linkText("Add Product")).click();
		}

		@When("^Admin Adds all the product Info$")
		public void admin_Adds_all_the_product_Info() throws Throwable {
			driver.findElement(By.id("productName")).sendKeys("Dcold Total");
			Thread.sleep(2000);
			
			driver.findElement(By.id("category")).sendKeys("HealthCare");
			Thread.sleep(2000);
			
			driver.findElement(By.id("quantity")).sendKeys("2000");
			Thread.sleep(2000);
			
			driver.findElement(By.id("price")).sendKeys("3");
			Thread.sleep(2000);
			
			driver.findElement(By.id("description")).sendKeys("For HeadAches");
			Thread.sleep(2000);
			
			driver.findElement(By.id("searchKeyword")).sendKeys("Dcold");
			Thread.sleep(2000);
			
		}

		@When("^Admin then Clicks on add product button$")
		public void admin_then_Clicks_on_add_product_button() throws Throwable {
			
			driver.findElement(By.xpath("//div/button")).click();
			Thread.sleep(10000);
		}
		
		//remove a product from list (valid)
		
		
		@When("^Admin clicks on remove button for a particular product$")
		public void admin_clicks_on_remove_button_for_a_particular_product() throws Throwable {
			driver.findElement(By.xpath("//td/button")).click();
			Thread.sleep(3000);
		}

		@Then("^The product info should get removed$")
		public void the_product_info_should_get_removed() throws Throwable {
			System.out.println("Removed");
			Thread.sleep(6000);
			
		}

			
	
}
	
	
	
	
		
	

