package com.customer.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;

import com.customer.demo.model.Customer;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,Integer>

{

}