package com.cg.oms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cg.oms.beans.Customer;
@SpringBootApplication
@ComponentScan(basePackageClasses = Customer.class)
public class OnlineMedicalStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineMedicalStoreApplication.class, args);
	}

}
