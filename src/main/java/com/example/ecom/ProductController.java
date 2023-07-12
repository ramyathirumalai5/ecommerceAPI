package com.example.ecom;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @AutoWired
    ProductRepository productRepository;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        productRepository.save(product);
        return product;
    }

    @GetMapping("/productbyname/{name}")
    public Product getProductByName(@PathVariable String name){
        return productRepository.findProductByName(name);
    }


}
