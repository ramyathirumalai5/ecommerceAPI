package com.example.ecom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
   //OperationProductByAttribute
    public Product findProductByName(String name);
}
