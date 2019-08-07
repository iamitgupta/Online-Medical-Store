package com.cg.oms.main;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.oms.services.OnlineMedicalStoreServices;

@RestController
public class OMSApp {
	
	
		@Autowired
		OnlineMedicalStoreServices service;
		
//		note:
		
//		database name: onlinemedicalstore_db
		
//		for admin api use '/admin/' as suffix eg. @GetMapping("/admin/login") and
//		for customer use '/customer/'eg.  @GetMapping("/customer/login") and if the 
//		api is common for both then the do not use
//		any suffix eg. @GetMapping("/searchProduct")
		
		
		
		
		//API controller methods here
		
		
		

}
