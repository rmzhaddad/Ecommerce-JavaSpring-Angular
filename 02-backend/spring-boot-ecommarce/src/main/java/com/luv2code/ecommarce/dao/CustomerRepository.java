package com.luv2code.ecommarce.dao;

import com.luv2code.ecommarce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
