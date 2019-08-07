package com.cg.oms.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.oms.beans.Cart;
import com.cg.oms.beans.Customer;
import com.cg.oms.services.OnlineMedicalStoreServices;
import com.cg.oms.services.OnlineMedicalStoreServicesImpl;

@RestController
public class OMSApp {
	
		//db name : onlinemedicalstore_db
		//change hbm2ddl.auto value in persistence.xml file only
	
	
	

//		@Autowired
	OnlineMedicalStoreServices service = new OnlineMedicalStoreServicesImpl();
	AnnotationConfigApplicationContext userctx = new AnnotationConfigApplicationContext(Customer.class);

	// API controller methods here

	// Customer API
	// Add to cart
	@RequestMapping(value = "/customer/addToCart", method = RequestMethod.POST)
	public Cart createEmployee(@RequestBody Cart inputCart) {
		Cart cart = service.addToCart(inputCart.getProduct1Id(), inputCart.getProduct1Count(),
				inputCart.getCustomerId());
		return cart;
	}
	// Admin API

}
