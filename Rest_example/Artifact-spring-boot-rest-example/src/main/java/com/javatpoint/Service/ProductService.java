package com.javatpoint.Service;

import com.javatpoint.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {
    @Override
    public List<Product> findAll() {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product(100,"mobile","GLK",10000.00,6));
        products.add(new Product(101,"smart tv","GLK",9000.00,7));
        products.add(new Product(102,"Washing Machine","GLK",8000.00,8));
        products.add(new Product(103,"laptop","GLK",7000.00,9));
        products.add(new Product(104,"Refrigirator","GLK",6000.00,10));

            return products;
    }
}
