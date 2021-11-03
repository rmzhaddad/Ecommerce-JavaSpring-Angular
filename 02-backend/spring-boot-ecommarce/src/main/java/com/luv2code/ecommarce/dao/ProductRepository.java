package com.luv2code.ecommarce.dao;

import com.luv2code.ecommarce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")

public interface ProductRepository extends JpaRepository<Product,Long> {


}
