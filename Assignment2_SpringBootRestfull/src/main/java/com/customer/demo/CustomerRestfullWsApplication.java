/*
 2)Develop an application using SpringBoot with RestFull Web Services(CRUD Operations).

 Perform Insert,delete,update,select operations and Test this application using PostMan Tool.

Hint: TableName: Customer

  columnnames: customerid,customername,customerphone,customeraddress,customerloginid,customerpassword ..etc

*/


package com.customer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerRestfullWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerRestfullWsApplication.class, args);
		System.out.println("Server Started");
	}

}


//FOR RUNNING
//http://localhost:8080/h2-console

//http://localhost:8080
