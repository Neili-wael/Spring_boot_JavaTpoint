package com.javatpoint.Controller;


import com.javatpoint.Service.IProductService;
import com.javatpoint.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductController {

 @Autowired
    private IProductService productService;

    @GetMapping(value="/product")
public List<Product> GetProduct(){

        List<Product> products = productService.findAll();
        return products;
    }




}
