/*
 1)Write an application using SpringMVC with SpringBoot.

You need to read data dynamically from Customer (customerid,customername,customerphone,customeraddress,customerloginid,customerpassword)

 and then display on webpage. (CustomerSB)

 */


package com.customer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerSbApplication.class, args);
		System.out.println("Server Started");
	}

}
