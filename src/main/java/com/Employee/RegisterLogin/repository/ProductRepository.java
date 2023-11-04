package com.Employee.RegisterLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Employee.RegisterLogin.model.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
