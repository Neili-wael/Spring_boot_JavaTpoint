package com.javatpoint.Service;

import com.javatpoint.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IProductService {
   List<Product> findAll();
}
